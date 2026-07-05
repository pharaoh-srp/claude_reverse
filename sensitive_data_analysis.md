# 敏感数据采集深度分析补充报告

**分析日期**: 2026-07-04  
**范围**: 逐字段确认每个敏感信息是否被采集和上传  
**方法**: 在反编译代码中搜索关键字、读取上下文代码、追踪数据流

---

## 一、时区信息 ⚠️ 确认采集

### 1.1 Datadog RUM Device 模型

**文件**: `defpackage/ooe.java` → Datadog RUM `Device` 数据类

```java
public final class ooe {
    public final int a;         // type (设备类型)
    public final String b;      // name
    public final String c;      // model
    public final String d;      // brand
    public final String e;      // architecture
    public final String f;      // locale
    public final List g;        // locales
    public final String h;      // ⚠️ timeZone ← 时区信息
    public final Number i;      // batteryLevel
    public final Boolean j;     // powerSavingMode
    public final Number k;      // brightnessLevel
    public final Number l;      // logicalCpuCount
    public final Number m;      // totalRam
    public final Boolean n;     // isLowRam
}
```

**toString() 输出确认**:
```
Device(type=..., name=..., model=..., brand=..., architecture=..., locale=..., locales=..., timeZone=..., batteryLevel=..., powerSavingMode=..., brightnessLevel=..., logicalCpuCount=..., totalRam=..., isLowRam=...)
```

### 1.2 Datadog 内部 DeviceInfo (p26) 模型

**文件**: `defpackage/p26.java` → Datadog 内部设备信息

```java
public final class p26 {
    // deviceName, deviceBrand, deviceModel, deviceType, deviceBuildId
    // osName, osMajorVersion, osVersion, architecture
    // numberOfDisplays, logicalCpuCount, totalRam, isLowRam
    // ⚠️ localeInfo 包含 timeZone
}
```

**LocaleInfo 子类** (`defpackage/fea.java`):
```java
public final class fea {
    public final List a;      // locales (语言列表)
    public final String b;    // currentLocale (当前语言)
    public final String c;    // ⚠️ timeZone ← 时区
}
```

### 1.3 RUM 事件 JSON 字段名

在 `defpackage/mpk.java` 和 `defpackage/rij.java` 中确认 JSON 字段名为 `time_zone`：
```java
bh9 bh9VarS8 = qh9Var.s("time_zone");
String strM7 = bh9VarS8 != null ? bh9VarS8.m() : null;
```

### 结论

| 数据 | 是否采集 | 采集方 | JSON 字段名 |
|------|---------|--------|------------|
| 时区 | ✅ 是 | Datadog RUM | `time_zone` |
| 当前语言 | ✅ 是 | Datadog RUM | `locale` / `currentLocale` |
| 语言列表 | ✅ 是 | Datadog RUM | `locales` |

---

## 二、地理位置信息 ⚠️ 确认采集（Sift Science，条件性）

### 2.1 Sift Science AppStateCollector

**文件**: `siftscience/android/AppStateCollector.java`

```java
// 使用 Google FusedLocationProviderClient 获取 GPS 坐标
private Location location;
private Location lastLocation;
private q08 mFusedLocationClient;  // Google Play Services FusedLocation

private boolean checkPermissions() {
    return x44.x(this.context, "android.permission.ACCESS_FINE_LOCATION") == 0 
        && x44.x(this.context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
}

private AndroidDeviceLocationJson getLocation() {
    Location location = this.acquiredNewLocation ? this.location : this.lastLocation;
    return new AndroidDeviceLocationJson()
        .withLatitude(Double.valueOf(location.getLatitude()))
        .withLongitude(Double.valueOf(location.getLongitude()));
}
```

### 2.2 位置数据模型

**文件**: `com/sift/api/representations/AndroidDeviceLocationJson.java`

```java
public class AndroidDeviceLocationJson {
    @aof("latitude")
    public Double latitude;           // ⚠️ GPS 纬度

    @aof("longitude")
    public Double longitude;          // ⚠️ GPS 经度
}
```

### 2.3 位置采集条件

**关键**：位置采集受 `disallowLocationCollection` 配置控制：

```java
if (siftImpl.getConfig().disallowLocationCollection) {
    return;  // 如果配置禁止，则不采集
}
```

但在 Sift 初始化代码 (`defpackage/b6g.java`) 中：
```java
Sift.open(activity, new Sift.Config.Builder()
    .withAccountId(e6gVar.a())
    .withBeaconKey(e6gVar.b())
    .build());  // ⚠️ 未调用 withDisallowLocationCollection(true)
```

**默认 `disallowLocationCollection = false`**，因此**如果用户授予了位置权限，GPS 坐标会被采集并上传**。

### 2.4 Sift 位置采集行为

- 请求 `ACCESS_FINE_LOCATION` + `ACCESS_COARSE_LOCATION` 权限
- 如果有权限，使用 FusedLocationProviderClient 获取一次精确位置
- 获取后立即断开位置服务（只取一次）
- 上传经纬度到 Sift 后端

### 结论

| 数据 | 是否采集 | 采集方 | 条件 |
|------|---------|--------|------|
| GPS 纬度 | ✅ 条件性 | Sift Science | 需位置权限，默认 `disallowLocationCollection=false` |
| GPS 经度 | ✅ 条件性 | Sift Science | 同上 |
| 持续追踪 | ❌ 否 | — | 只获取一次后断开 |

---

## 三、详细设备信息 ⚠️ 确认大量采集

### 3.1 Sift Science 采集的设备信息

**文件**: `siftscience/android/DevicePropertiesCollector.java` → `AndroidDevicePropertiesJson`

| 字段 | JSON 名 | 采集方式 | 敏感程度 |
|------|---------|----------|---------|
| **Android ID** | `android_id` | `Settings.Secure.getString(cr, "android_id")` | 🔴 高（持久设备标识） |
| **设备制造商** | `device_manufacturer` | `Build.MANUFACTURER` | 🟡 中 |
| **设备型号** | `device_model` | `Build.MODEL` | 🟡 中 |
| **系统版本** | `device_system_version` | `Build.VERSION.RELEASE` | 🟡 中 |
| **运营商名称** | `mobile_carrier_name` | `TelephonyManager.getNetworkOperatorName()` | 🟡 中 |
| **SIM 国家代码** | `mobile_iso_country_code` | `TelephonyManager.getSimCountryIso()` | 🟡 中 |
| **Build Tags** | `build_tags` | `Build.TAGS` | 🟡 中 |
| **Root 检测** | `evidence_files_present` | 检查 su 二进制文件是否存在 | 🟡 中 |
| **危险应用** | `evidence_packages_present` | 检查已知 Root/危险应用包名 | 🟡 中 |
| **危险属性** | `evidence_properties` | `getprop` 检查 ro.debuggable/ro.secure | 🟡 中 |
| **可写目录** | `evidence_directories_writable` | `mount` 检查系统分区是否可写 | 🟡 中 |
| **已安装应用** | `installed_apps` | `List<AndroidInstalledAppJson>` 字段定义存在 | 🔴 高 |

### 3.2 已安装应用检测

**文件**: `com/sift/api/representations/AndroidDevicePropertiesJson.java`

```java
@aof("installed_apps")
public List<AndroidInstalledAppJson> installedApps = new ArrayList<>();
```

虽然 `AndroidDevicePropertiesJson` 定义了 `installed_apps` 字段，但在 `DevicePropertiesCollector.get()` 的反编译代码中，**未见对 `withInstalledApps()` 的调用**。当前代码只检查**特定 Root/危险应用包名**是否存在（通过 `PackageManager.getPackageInfo()` 逐个检查），而非枚举所有已安装应用。

**结论**：Sift **不枚举全部已安装应用**，但检查**特定 Root/危险应用**是否存在。

### 3.3 Datadog RUM 采集的设备信息

**文件**: `defpackage/p26.java` + `defpackage/hye.java`

| 字段 | 对应 Build 属性 | 敏感程度 |
|------|----------------|---------|
| **deviceName** | — | 🟡 中 |
| **deviceBrand** | `Build.BRAND` | 🟡 中 |
| **deviceModel** | `Build.MODEL` | 🟡 中 |
| **deviceType** | 通过 UiModeManager 判断 | 🟢 低 |
| **deviceBuildId** | — | 🟡 中 |
| **osName** | — | 🟢 低 |
| **osMajorVersion** | — | 🟢 低 |
| **osVersion** | `Build.VERSION.RELEASE` | 🟢 低 |
| **architecture** | `Build.CPU_ABI` 或类似 | 🟡 中 |
| **numberOfDisplays** | — | 🟢 低 |
| **localeInfo.locales** | LocaleList | 🟡 中 |
| **localeInfo.currentLocale** | Locale.getDefault() | 🟡 中 |
| **localeInfo.timeZone** | TimeZone.getDefault() | 🟡 中 |
| **logicalCpuCount** | Runtime.availableProcessors() | 🟢 低 |
| **totalRam** | ActivityManager.MemoryInfo.totalMem | 🟡 中 |
| **isLowRam** | ActivityManager.isLowRamDevice() | 🟢 低 |

### 3.4 Google Play Billing 采集的设备信息

**文件**: `defpackage/zo1.java` + `defpackage/itk.java`

```java
// zo1.x() — BillingClient 设备信息填充
public static final void x(atk atkVar, Context context) {
    ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
    if (activityManager != null) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        int i = (int) (memoryInfo.totalMem / w6.MAX_EVENT_SIZE_BYTES);
        itk.v((itk) atkVar.F, i);        // totalRam
        String str = Build.BRAND;
        itk.r((itk) atkVar.F);           // ⚠️ Build.BRAND
        String str2 = Build.MODEL;
        itk.u((itk) atkVar.F);           // ⚠️ Build.MODEL
        String str3 = Build.MANUFACTURER;
        itk.t((itk) atkVar.F);           // ⚠️ Build.MANUFACTURER
        String str4 = Build.FINGERPRINT;
        itk.s((itk) atkVar.F);           // ⚠️ Build.FINGERPRINT
    }
}
```

**⚠️ `Build.FINGERPRINT` 被采集** — 这是设备唯一标识符，格式为 `brand/device/product/version/_build/tags`，是高度可指纹化的信息。

### 3.5 Claude 自有 API 采集的设备信息

**文件**: `com/anthropic/claude/api/feedback/DeviceInfo.java`

```java
public DeviceInfo(String str, int i) {
    String str2 = Build.VERSION.RELEASE;
    String strValueOf = str2 == null ? String.valueOf(Build.VERSION.SDK_INT) : str2;
    String string = bsg.k1(Build.MANUFACTURER + " " + Build.MODEL).toString();  // ⚠️ 制造商+型号
    String languageTag = Locale.getDefault().toLanguageTag();                     // ⚠️ 语言标签
    this("Android", strValueOf, str, strValueOf2, string, languageTag);
}
```

| 字段 | JSON 名 | 数据来源 | 敏感程度 |
|------|---------|----------|---------|
| platform | `platform` | 硬编码 "Android" | 🟢 低 |
| OS 版本 | `os_version` | `Build.VERSION.RELEASE` | 🟢 低 |
| 应用版本 | `app_version` | 传入参数 | 🟢 低 |
| 构建号 | `build_number` | 传入参数 | 🟢 低 |
| 设备型号 | `device_model` | `Build.MANUFACTURER + " " + Build.MODEL` | 🟡 中 |
| 区域设置 | `locale` | `Locale.getDefault().toLanguageTag()` | 🟡 中 |

### 3.6 Datadog 网络信息收集

**文件**: `defpackage/ey1.java` — BroadcastReceiverNetworkInfoProvider

```java
// 网络类型识别
ConnectivityManager → activeNetworkInfo
  → type=1 → WiFi (a1c type=3)
  → type=9 → Ethernet (a1c type=2)  
  → 其他 → 根据 subtype 识别: GPRS/Edge/UMTS/CDMA/LTE/NR 等

// 如果配置允许 (hz1.e = true):
TelephonyManager.getSimCarrierIdName()   // ⚠️ 运营商名称
TelephonyManager.getSimCarrierId()       // ⚠️ 运营商 ID
```

### 结论

| 数据 | 是否采集 | 采集方 | 敏感程度 |
|------|---------|--------|---------|
| **Android ID** | ✅ 是 | Sift Science | 🔴 高 |
| **Build.MODEL** | ✅ 是 | Sift, Datadog, Billing, Claude API | 🟡 中 |
| **Build.BRAND** | ✅ 是 | Datadog, Billing | 🟡 中 |
| **Build.MANUFACTURER** | ✅ 是 | Sift, Billing, Claude API | 🟡 中 |
| **Build.FINGERPRINT** | ✅ 是 | Google Play Billing | 🔴 高（强指纹） |
| **Build.TAGS** | ✅ 是 | Sift Science | 🟡 中 |
| **Build.VERSION.RELEASE** | ✅ 是 | Sift, Datadog, Claude API | 🟢 低 |
| **Build.VERSION.SDK_INT** | ✅ 是 | Billing | 🟢 低 |
| **IMEI** | ❌ 否 | 未发现 | — |
| **广告 ID** | ❌ 否 | 未发现 | — |
| **运营商名称** | ✅ 是 | Sift, Datadog | 🟡 中 |
| **SIM 国家代码** | ✅ 是 | Sift | 🟡 中 |
| **SIM 运营商 ID** | ✅ 是 | Datadog | 🟡 中 |
| **网络类型** | ✅ 是 | Datadog (WiFi/移动/以太网 + 详细子类型) | 🟢 低 |

---

## 四、IP 地址 ⚠️ 确认采集

### 4.1 Sift Science — 本地网络接口 IP

**文件**: `siftscience/android/AppStateCollector.java`

```java
private List<String> getIpAddresses() {
    ArrayList arrayList = new ArrayList();
    Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
    while (networkInterfaces != null && networkInterfaces.hasMoreElements()) {
        Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
        while (inetAddresses.hasMoreElements()) {
            InetAddress inetAddressNextElement = inetAddresses.nextElement();
            if (!inetAddressNextElement.isLoopbackAddress()) {
                String lowerCase = inetAddressNextElement.getHostAddress().toLowerCase(Locale.US);
                arrayList.add(lowerCase);  // ⚠️ 收集所有非 loopback IP
            }
        }
    }
    return arrayList;
}
```

**数据模型**:
```java
// AndroidAppStateJson
@aof("network_addresses")
public List<String> networkAddresses = new ArrayList<>();  // ⚠️ 本地 IP 地址列表
```

### 4.2 Sentry — IP 地址

**文件**: `io/sentry/h7.java` + `io/sentry/protocol/i0.java`

```java
// Sentry User 协议中包含 ip_address 字段
yVar.r("ip_address");
yVar.x(a1Var, str4);  // 序列化 IP 地址
```

**文件**: `io/sentry/f.java`
```java
case "ip_address":
    strI41 = p3Var2.I();  // 解析 ip_address
```

Sentry 默认会在服务端从请求中提取客户端 IP 地址（通过 `X-Forwarded-For` 头），也可以在客户端手动设置。

### 结论

| 数据 | 是否采集 | 采集方 | 方式 |
|------|---------|--------|------|
| **本地 IP 地址** | ✅ 是 | Sift Science | 枚举 NetworkInterface，收集所有非 loopback IP |
| **公网 IP 地址** | ✅ 是（服务端推断） | Sentry | 服务端从 HTTP 请求推断 |
| **公网 IP 地址** | ✅ 是（服务端推断） | Datadog | 服务端从 HTTP 请求推断 |
| **公网 IP 地址** | ✅ 是（服务端推断） | Segment/Anthropic API | 服务端从 HTTP 请求推断 |

---

## 五、网络信息

### 5.1 WiFi SSID / BSSID

**搜索结果**: ❌ **未发现采集 WiFi SSID 或 BSSID 的代码**

搜索了 `ssid`, `bssid`, `BSSID`, `SSID`, `wifi_info`, `wifiInfo`, `WiFiManager`, `getConnectionInfo` 等关键词，在 Claude/Sift/Datadog/Sentry 代码中均无匹配。

### 5.2 VPN 状态

**搜索结果**: ❌ **未发现主动采集 VPN 状态的代码**

`p0c.java` 中有 `VPN` 枚举值，但这属于 Android 网络类型定义，未发现 Claude 代码主动检查 `NetworkCapabilities.TRANSPORT_VPN` 或类似 API。

### 5.3 代理设置

**搜索结果**: ❌ **未发现采集代理设置的代码**

搜索了 `proxy`, `PROXY`, `HttpProxy`, `setProxy`, `ProxySelector` 等，仅发现 Google Billing 的 `ProxyBillingActivityV2`（与遥测无关）。

### 结论

| 数据 | 是否采集 | 说明 |
|------|---------|------|
| **WiFi SSID** | ❌ 否 | 未发现采集代码 |
| **WiFi BSSID** | ❌ 否 | 未发现采集代码 |
| **VPN 状态** | ❌ 否 | 未发现主动检查代码 |
| **代理设置** | ❌ 否 | 未发现采集代码 |
| **网络类型** | ✅ 是 | Datadog 采集 WiFi/移动/以太网及子类型 |

---

## 六、其他敏感信息

### 6.1 应用安装列表

**结论**: ⚠️ **部分采集**

- Sift Science **不枚举全部已安装应用**
- 但会**检查特定 Root/危险/伪装应用**是否存在（约 20 个已知包名）
- 检查方法：`PackageManager.getPackageInfo(packageName, 0)` 逐个查询

**检查的应用类别**：
- Root 应用: `com.noshufou.android.su`, `eu.chainfire.supersu` 等
- 危险应用: `com.dimonvideo.luckypatcher` 等
- Root 伪装应用: `com.devadvance.rootcloak`, `de.robv.android.xposed.installer` 等

### 6.2 剪贴板内容

**结论**: ❌ **未发现采集剪贴板内容的遥测代码**

搜索了 `clipboard`, `ClipboardManager`, `getPrimaryClip`, `CLIPBOARD_SERVICE`。结果仅涉及 Compose UI 框架的内部剪贴板管理（`AndroidComposeView.clipboardManager`），无遥测上报。

### 6.3 电池状态

**结论**: ✅ **多处采集**

| 采集方 | 数据 | 字段 |
|--------|------|------|
| Sift Science | 电池电量、充电状态、电池健康、插电状态 | `battery_level`, `battery_state`, `battery_health`, `plug_state` |
| Datadog RUM | 电池电量、省电模式 | `battery_level`, `power_saving_mode` |
| Claude 内部 (o1h) | 电池满/充电中、电量、省电模式、外部电源 | `batteryFullOrCharging`, `batteryLevel`, `powerSaveMode`, `onExternalPowerSource` |

### 6.4 存储空间

**结论**: ❌ **未发现采集存储空间信息的遥测代码**

搜索了 `getStorage`, `storage_state`, `freeStorage`, `totalStorage` 等，未发现遥测相关采集。

### 6.5 屏幕分辨率

**结论**: ❌ **未发现采集屏幕分辨率的遥测代码**

Datadog 和 Sift 的 Device 模型中均未包含 `screen_width`、`screen_height`、`displayMetrics` 等字段。`DisplayMetrics` 仅在 UI 渲染代码中使用，未上报。

### 6.6 内存信息

**结论**: ✅ **采集总 RAM 大小和低内存标志**

| 采集方 | 数据 | 字段 |
|--------|------|------|
| Datadog RUM | 总 RAM (MB), isLowRam | `total_ram`, `is_low_ram` |
| Google Billing | 总 RAM (MB) | `totalRam` (itk.zzn) |

### 6.7 CPU 信息

**结论**: ✅ **采集逻辑 CPU 核心数和架构**

| 采集方 | 数据 | 字段 |
|--------|------|------|
| Datadog RUM | 逻辑 CPU 核心数 | `logical_cpu_count` |
| Datadog RUM | CPU 架构 | `architecture` |

### 6.8 屏幕亮度

**结论**: ✅ **Datadog RUM 采集**

| 采集方 | 数据 | 字段 |
|--------|------|------|
| Datadog RUM | 屏幕亮度级别 | `brightness_level` |

---

## 七、各 SDK 敏感数据采集矩阵

| 敏感数据 | Sift Science | Datadog RUM | Sentry | Google Billing | Claude API | Segment |
|----------|:---:|:---:|:---:|:---:|:---:|:---:|
| **Android ID** | ✅ | ❌ | ❌ | ❌ | ❌ | ❌ |
| **GPS 经纬度** | ✅* | ❌ | ❌ | ❌ | ❌ | ❌ |
| **Build.FINGERPRINT** | ❌ | ❌ | ❌ | ✅ | ❌ | ❌ |
| **Build.MODEL** | ✅ | ✅ | ❌ | ✅ | ✅ | ❌ |
| **Build.BRAND** | ❌ | ✅ | ❌ | ✅ | ❌ | ❌ |
| **Build.MANUFACTURER** | ✅ | ✅ | ❌ | ✅ | ✅ | ❌ |
| **时区** | ❌ | ✅ | ❌ | ❌ | ❌ | ❌ |
| **语言/地区** | ✅ (SIM ISO) | ✅ (locale) | ❌ | ❌ | ✅ (locale) | ❌ |
| **运营商信息** | ✅ | ✅ | ❌ | ❌ | ❌ | ❌ |
| **本地 IP 地址** | ✅ | ❌ | ❌ | ❌ | ❌ | ❌ |
| **电池信息** | ✅ | ✅ | ❌ | ❌ | ❌ | ❌ |
| **网络类型** | ❌ | ✅ | ❌ | ❌ | ❌ | ❌ |
| **RAM 信息** | ❌ | ✅ | ❌ | ✅ | ❌ | ❌ |
| **CPU 信息** | ❌ | ✅ | ❌ | ❌ | ❌ | ❌ |
| **屏幕亮度** | ❌ | ✅ | ❌ | ❌ | ❌ | ❌ |
| **Root 检测** | ✅ | ❌ | ❌ | ❌ | ❌ | ❌ |
| **邮箱** | ❌ | ❌ | ❌ | ❌ | ❌ | ✅ (Traits) |
| **订阅级别** | ❌ | ❌ | ❌ | ❌ | ❌ | ✅ (Traits) |
| **WiFi SSID** | ❌ | ❌ | ❌ | ❌ | ❌ | ❌ |
| **剪贴板** | ❌ | ❌ | ❌ | ❌ | ❌ | ❌ |
| **全部已安装应用** | ❌ | ❌ | ❌ | ❌ | ❌ | ❌ |
| **VPN 状态** | ❌ | ❌ | ❌ | ❌ | ❌ | ❌ |
| **代理设置** | ❌ | ❌ | ❌ | ❌ | ❌ | ❌ |
| **存储空间** | ❌ | ❌ | ❌ | ❌ | ❌ | ❌ |
| **屏幕分辨率** | ❌ | ❌ | ❌ | ❌ | ❌ | ❌ |
| **IMEI** | ❌ | ❌ | ❌ | ❌ | ❌ | ❌ |
| **广告 ID** | ❌ | ❌ | ❌ | ❌ | ❌ | ❌ |

*GPS 采集需用户授权位置权限，且 Sift 配置默认 `disallowLocationCollection=false`

---

## 八、最高风险发现

### 🔴 高风险

1. **Android ID 被 Sift Science 采集** — `Settings.Secure.getString(cr, "android_id")` 作为 `installationId` 上报，是持久性设备标识符
2. **GPS 经纬度被 Sift Science 条件性采集** — 虽需权限，但默认配置允许采集
3. **Build.FINGERPRINT 被 Google Billing 采集** — 包含设备唯一构建信息，是强指纹标识
4. **本地 IP 地址被 Sift Science 枚举采集** — 收集所有网络接口的非 loopback IP

### 🟡 中风险

5. **时区信息被 Datadog RUM 采集** — 可推断用户大致地理位置
6. **运营商信息多处采集** — Sift 和 Datadog 均采集运营商名称和 SIM 国家代码
7. **Root/越狱检测** — Sift 检查 su 文件、Root 应用、危险属性、可写系统分区
8. **语言和地区信息多处采集** — Datadog 和 Claude API 均上报
9. **电池信息多处采集** — 电池电量、充电状态、健康度

### 🟢 低风险（未采集）

10. ❌ WiFi SSID/BSSID — 未采集
11. ❌ 剪贴板内容 — 未采集
12. ❌ 全部已安装应用列表 — 未枚举（仅检查特定 Root 应用）
13. ❌ VPN 状态 — 未主动检查
14. ❌ 代理设置 — 未采集
15. ❌ IMEI/设备序列号 — 未采集
16. ❌ 广告 ID — 未采集
17. ❌ 屏幕分辨率 — 未采集
18. ❌ 存储空间 — 未采集

---

## 九、关键源码文件索引

```
# Sift Science
siftscience/android/DevicePropertiesCollector.java  — 设备属性采集（Android ID, 型号, 运营商, Root 检测）
siftscience/android/AppStateCollector.java            — 应用状态采集（GPS, IP, 电池）
com/sift/api/representations/AndroidDevicePropertiesJson.java  — 设备属性数据模型
com/sift/api/representations/AndroidAppStateJson.java           — 应用状态数据模型
com/sift/api/representations/AndroidDeviceLocationJson.java     — GPS 位置数据模型

# Datadog RUM
defpackage/ooe.java   — Device 数据类 (type, name, model, brand, architecture, locale, locales, timeZone, batteryLevel, powerSavingMode, brightnessLevel, logicalCpuCount, totalRam, isLowRam)
defpackage/fwi.java   — 同 ooe，另一处 Device 模型
defpackage/p26.java   — DeviceInfo 内部模型 (deviceName, deviceBrand, deviceModel, deviceType, deviceBuildId, osName, osVersion, architecture, localeInfo, logicalCpuCount, totalRam, isLowRam)
defpackage/fea.java   — LocaleInfo (locales, currentLocale, timeZone)
defpackage/mpk.java   — Device JSON 解析 (读取 type, name, model, brand, architecture, locale, locales, time_zone, battery_level, power_saving_mode, brightness_level, logical_cpu_count, total_ram, is_low_ram)
defpackage/ey1.java   — 网络信息采集 (WiFi/移动网络类型, 运营商名称, SIM Carrier ID)
defpackage/hye.java   — RUM 事件构建（将 p26 → ooe 转换）

# Google Play Billing
defpackage/zo1.java   — BillingClient 设备信息填充 (totalRam, Build.BRAND, Build.MODEL, Build.MANUFACTURER, Build.FINGERPRINT)
defpackage/itk.java   — 设备信息 protobuf 模型 (versionName, packageName, totalRam, brand, model, manufacturer, fingerprint)

# Claude 自有
com/anthropic/claude/api/feedback/DeviceInfo.java  — 反馈 API 设备信息 (platform, os_version, app_version, build_number, device_model, locale)
com/anthropic/claude/analytics/ClaudeAnalyticsImpl$Traits.java  — Segment Traits (account_uuid, organization_uuid, email, subscription_level)

# Sentry
io/sentry/h7.java              — Sentry User 含 ip_address 字段
io/sentry/protocol/i0.java     — Sentry 协议含 ip_address 字段

# Sift 初始化
defpackage/b6g.java  — Sift.open() 调用（未设置 disallowLocationCollection）
```
