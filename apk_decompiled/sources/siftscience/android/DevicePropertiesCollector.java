package siftscience.android;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.sift.api.representations.AndroidDevicePropertiesJson;
import com.sift.api.representations.MobileEventJson;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

/* JADX INFO: loaded from: classes.dex */
public class DevicePropertiesCollector {
    private static final String TAG = "siftscience.android.DevicePropertiesCollector";
    private final Context context;
    private final SiftImpl sift;
    private static final String[] SU_PATHS = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
    private static final String[] KNOWN_ROOT_APPS_PACKAGES = {"com.noshufou.android.su", "com.noshufou.android.su.elite", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.thirdparty.superuser", "com.yellowes.su"};
    private static final String[] KNOWN_DANGEROUS_APPS_PACKAGES = {"com.koushikdutta.rommanager", "com.dimonvideo.luckypatcher", "com.chelpus.lackypatch", "com.ramdroid.appquarantine"};
    private static final String[] KNOWN_ROOT_CLOAKING_PACKAGES = {"com.devadvance.rootcloak", "de.robv.android.xposed.installer", "com.saurik.substrate", "com.devadvance.rootcloakplus", "com.zachspong.temprootremovejb", "com.amphoras.hidemyroot", "com.formyhm.hideroot"};
    private static final String[] PATHS_THAT_SHOULD_NOT_BE_WRITABLE = {"/system", "/system/bin", "/system/sbin", "/system/xbin", "/vendor/bin", "/sbin", "/etc"};
    private static final Map<String, String> DANGEROUS_PROPERTIES = new HashMap<String, String>() { // from class: siftscience.android.DevicePropertiesCollector.1
        {
            put("[ro.debuggable]", "[1]");
            put("[ro.secure]", "[0]");
        }
    };

    public DevicePropertiesCollector(SiftImpl siftImpl, Context context) {
        this.sift = siftImpl;
        this.context = context.getApplicationContext();
    }

    private List<String> existingDangerousProperties() {
        String[] strArrPropertiesReader = propertiesReader();
        ArrayList arrayList = new ArrayList();
        for (String str : strArrPropertiesReader) {
            for (String str2 : DANGEROUS_PROPERTIES.keySet()) {
                if (str.contains(str2) && str.contains(DANGEROUS_PROPERTIES.get(str2))) {
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    private List<String> existingRWPaths() {
        String[] strArrMountReader = mountReader();
        ArrayList arrayList = new ArrayList();
        for (String str : strArrMountReader) {
            String[] strArrSplit = str.split(" ");
            if (strArrSplit.length < 4) {
                Log.e(TAG, "Error formatting mount: ".concat(str));
            } else {
                String str2 = strArrSplit[1];
                String str3 = strArrSplit[3];
                for (String str4 : PATHS_THAT_SHOULD_NOT_BE_WRITABLE) {
                    if (str2.equalsIgnoreCase(str4)) {
                        String[] strArrSplit2 = str3.split(",");
                        int length = strArrSplit2.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            if (strArrSplit2[i].equalsIgnoreCase("rw")) {
                                arrayList.add(str4);
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private List<String> existingRootFiles() {
        ArrayList arrayList = new ArrayList();
        for (String str : SU_PATHS) {
            if (new File(str).exists()) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    private List<String> existingRootPackages() {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(KNOWN_ROOT_APPS_PACKAGES));
        arrayList.addAll(Arrays.asList(KNOWN_DANGEROUS_APPS_PACKAGES));
        arrayList.addAll(Arrays.asList(KNOWN_ROOT_CLOAKING_PACKAGES));
        PackageManager packageManager = this.context.getPackageManager();
        ArrayList arrayList2 = new ArrayList();
        if (packageManager != null) {
            for (String str : arrayList) {
                try {
                    packageManager.getPackageInfo(str, 0);
                    arrayList2.add(str);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.sift.api.representations.AndroidDevicePropertiesJson get() {
        /*
            r10 = this;
            android.content.Context r0 = r10.context
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L18
            android.content.Context r3 = r10.context     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L15
            java.lang.String r3 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L15
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo(r3, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L15
            goto L19
        L15:
            r0 = move-exception
            r3 = r2
            goto L33
        L18:
            r3 = r2
        L19:
            if (r0 == 0) goto L22
            java.lang.CharSequence r3 = r0.getApplicationLabel(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L15
            java.lang.String r3 = (java.lang.String) r3     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L15
            goto L23
        L22:
            r3 = r2
        L23:
            if (r0 == 0) goto L3a
            android.content.Context r4 = r10.context     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L32
            java.lang.String r4 = r4.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L32
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r4, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L32
            java.lang.String r0 = r0.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L32
            goto L3b
        L32:
            r0 = move-exception
        L33:
            java.lang.String r1 = siftscience.android.DevicePropertiesCollector.TAG
            java.lang.String r4 = "Encountered NameNotFoundException in get"
            android.util.Log.e(r1, r4, r0)
        L3a:
            r0 = r2
        L3b:
            android.content.Context r1 = r10.context
            java.lang.String r4 = "phone"
            java.lang.Object r1 = r1.getSystemService(r4)
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1
            if (r1 == 0) goto L4c
            java.lang.String r4 = r1.getNetworkOperatorName()
            goto L4d
        L4c:
            r4 = r2
        L4d:
            if (r1 == 0) goto L53
            java.lang.String r2 = r1.getSimCountryIso()
        L53:
            android.content.Context r1 = r10.context
            android.content.ContentResolver r1 = r1.getContentResolver()
            java.lang.String r5 = "android_id"
            java.lang.String r1 = android.provider.Settings.Secure.getString(r1, r5)
            java.lang.String r5 = android.os.Build.VERSION.RELEASE
            java.util.List r6 = r10.existingRootFiles()
            java.util.List r7 = r10.existingRootPackages()
            java.util.List r8 = r10.existingDangerousProperties()
            java.util.List r10 = r10.existingRWPaths()
            com.sift.api.representations.AndroidDevicePropertiesJson r9 = new com.sift.api.representations.AndroidDevicePropertiesJson
            r9.<init>()
            com.sift.api.representations.AndroidDevicePropertiesJson r3 = r9.withAppName(r3)
            com.sift.api.representations.AndroidDevicePropertiesJson r0 = r3.withAppVersion(r0)
            java.lang.String r3 = "1.3.0"
            com.sift.api.representations.AndroidDevicePropertiesJson r0 = r0.withSdkVersion(r3)
            com.sift.api.representations.AndroidDevicePropertiesJson r0 = r0.withAndroidId(r1)
            java.lang.String r1 = android.os.Build.MANUFACTURER
            com.sift.api.representations.AndroidDevicePropertiesJson r0 = r0.withDeviceManufacturer(r1)
            java.lang.String r1 = android.os.Build.MODEL
            com.sift.api.representations.AndroidDevicePropertiesJson r0 = r0.withDeviceModel(r1)
            com.sift.api.representations.AndroidDevicePropertiesJson r0 = r0.withMobileCarrierName(r4)
            com.sift.api.representations.AndroidDevicePropertiesJson r0 = r0.withMobileIsoCountryCode(r2)
            com.sift.api.representations.AndroidDevicePropertiesJson r0 = r0.withDeviceSystemVersion(r5)
            java.lang.String r1 = android.os.Build.TAGS
            com.sift.api.representations.AndroidDevicePropertiesJson r0 = r0.withBuildTags(r1)
            com.sift.api.representations.AndroidDevicePropertiesJson r0 = r0.withEvidenceFilesPresent(r6)
            com.sift.api.representations.AndroidDevicePropertiesJson r0 = r0.withEvidencePackagesPresent(r7)
            com.sift.api.representations.AndroidDevicePropertiesJson r0 = r0.withEvidenceProperties(r8)
            com.sift.api.representations.AndroidDevicePropertiesJson r10 = r0.withEvidenceDirectoriesWritable(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: siftscience.android.DevicePropertiesCollector.get():com.sift.api.representations.AndroidDevicePropertiesJson");
    }

    private String[] mountReader() {
        InputStream inputStream;
        String next;
        try {
            inputStream = Runtime.getRuntime().exec("mount").getInputStream();
        } catch (IOException e) {
            Log.e(TAG, "Error reading mount", e);
            inputStream = null;
        }
        if (inputStream == null) {
            return new String[0];
        }
        try {
            next = new Scanner(inputStream).useDelimiter("\\A").next();
        } catch (NoSuchElementException e2) {
            Log.e(TAG, "Error reading mount", e2);
            next = "";
        }
        return next.split("\n");
    }

    private String[] propertiesReader() {
        InputStream inputStream;
        String next;
        try {
            inputStream = Runtime.getRuntime().exec("getprop").getInputStream();
        } catch (IOException e) {
            Log.e(TAG, "Error reading properties", e);
            inputStream = null;
        }
        if (inputStream == null) {
            return new String[0];
        }
        try {
            next = new Scanner(inputStream).useDelimiter("\\A").next();
        } catch (NoSuchElementException e2) {
            Log.e(TAG, "Error reading properties", e2);
            next = "";
        }
        return next.split("\n");
    }

    public void collect() {
        AndroidDevicePropertiesJson androidDevicePropertiesJson = get();
        this.sift.appendDevicePropertiesEvent(new MobileEventJson().withAndroidDeviceProperties(androidDevicePropertiesJson).withInstallationId(androidDevicePropertiesJson.androidId).withTime(Long.valueOf(Time.now())));
    }
}
