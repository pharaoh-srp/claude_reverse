package siftscience.android;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import defpackage.aof;
import defpackage.bjg;
import defpackage.f57;
import defpackage.xd8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class Sift {
    static final xd8 GSON;
    static final String SDK_VERSION = "1.3.0";
    private static final String TAG = "siftscience.android.Sift";
    private static volatile AppStateCollector appStateCollector;
    private static volatile DevicePropertiesCollector devicePropertiesCollector;
    private static volatile ExecutorService executors;
    private static volatile boolean hasUnboundUserId;
    private static volatile SiftImpl instance;
    private static volatile String unboundUserId;

    static {
        f57 f57Var = f57.G;
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        LinkedList linkedList = new LinkedList();
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + arrayList.size() + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z = bjg.a;
        HashMap map2 = new HashMap(map);
        new ArrayList(arrayList);
        new ArrayList(arrayList2);
        GSON = new xd8(f57Var, map2, arrayList3, new ArrayList(linkedList));
        hasUnboundUserId = false;
    }

    private Sift() {
    }

    public static void close() {
        if (executors == null || executors.isShutdown()) {
            return;
        }
        executors.shutdown();
        try {
            executors.awaitTermination(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e(TAG, "Interrupted when awaiting executor termination", e);
        }
    }

    public static void collect() {
        if (executors == null || (executors != null && executors.isShutdown())) {
            executors = Executors.newSingleThreadScheduledExecutor();
        }
        executors.submit(new Runnable() { // from class: siftscience.android.Sift.1
            @Override // java.lang.Runnable
            public void run() {
                Sift.appStateCollector.collect();
                Sift.devicePropertiesCollector.collect();
            }
        });
    }

    public static void open(Context context, Config config, String str) {
        synchronized (Sift.class) {
            try {
                if (instance == null) {
                    Context applicationContext = context.getApplicationContext();
                    instance = new SiftImpl(applicationContext, config, unboundUserId, hasUnboundUserId);
                    devicePropertiesCollector = new DevicePropertiesCollector(instance, applicationContext);
                    appStateCollector = new AppStateCollector(instance, applicationContext);
                    unboundUserId = null;
                    hasUnboundUserId = false;
                } else if (config != null) {
                    instance.setConfig(config);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AppStateCollector appStateCollector2 = appStateCollector;
        if (str == null) {
            str = context.getClass().getSimpleName();
        }
        appStateCollector2.setActivityName(str);
    }

    public static void pause() {
        SiftImpl siftImpl = instance;
        if (siftImpl != null) {
            siftImpl.save();
        }
        AppStateCollector appStateCollector2 = appStateCollector;
        if (appStateCollector2 != null) {
            appStateCollector2.disconnectLocationServices();
        }
    }

    public static void resume(Context context, String str) {
        AppStateCollector appStateCollector2 = appStateCollector;
        if (appStateCollector2 != null) {
            appStateCollector2.reconnectLocationServices();
            if (str == null) {
                str = context.getClass().getSimpleName();
            }
            appStateCollector2.setActivityName(str);
        }
    }

    public static synchronized void setUserId(String str) {
        try {
            if (instance != null) {
                instance.setUserId(str);
            } else {
                unboundUserId = str;
                hasUnboundUserId = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void unsetUserId() {
        setUserId(null);
    }

    public static void upload() {
        if (instance != null) {
            instance.forceUploadAppStateEvent();
            instance.forceUploadDevicePropertiesEvent();
        }
    }

    public static class Config {
        private static final String DEFAULT_SERVER_URL_FORMAT = "https://api3.siftscience.com/v3/accounts/%s/mobile_events";

        @aof(alternate = {"accountId"}, value = "account_id")
        public final String accountId;

        @aof(alternate = {"beaconKey"}, value = "beacon_key")
        public final String beaconKey;

        @aof(alternate = {"disallowLocationCollection"}, value = "disallow_location_collection")
        public final boolean disallowLocationCollection;

        @aof(alternate = {"serverUrlFormat"}, value = "server_url_format")
        public final String serverUrlFormat;

        private Config(String str, String str2, String str3, boolean z) {
            this.accountId = str;
            this.beaconKey = str2;
            this.serverUrlFormat = str3;
            this.disallowLocationCollection = z;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return Utils.equals(this.accountId, config.accountId) && Utils.equals(this.beaconKey, config.beaconKey) && Utils.equals(this.serverUrlFormat, config.serverUrlFormat) && Utils.equals(Boolean.valueOf(this.disallowLocationCollection), Boolean.valueOf(config.disallowLocationCollection));
        }

        public boolean isValid() {
            ArrayList arrayList = new ArrayList();
            String str = this.accountId;
            if (str == null || str.isEmpty()) {
                arrayList.add("accountId");
            }
            String str2 = this.beaconKey;
            if (str2 == null || str2.isEmpty()) {
                arrayList.add("beacon key");
            }
            String str3 = this.serverUrlFormat;
            if (str3 == null || str3.isEmpty()) {
                arrayList.add("server URL format");
            }
            boolean z = arrayList.size() == 0;
            if (!z) {
                String unused = Sift.TAG;
                TextUtils.join(",", arrayList);
            }
            return z;
        }

        public Config() {
            this(null, null, DEFAULT_SERVER_URL_FORMAT, false);
        }

        public static class Builder {
            private String accountId;
            private String beaconKey;
            private boolean disallowLocationCollection;
            private String serverUrlFormat;

            public Builder(Config config) {
                this.accountId = config.accountId;
                this.beaconKey = config.beaconKey;
                this.serverUrlFormat = config.serverUrlFormat;
                this.disallowLocationCollection = config.disallowLocationCollection;
            }

            public Config build() {
                return new Config(this.accountId, this.beaconKey, this.serverUrlFormat, this.disallowLocationCollection);
            }

            public Builder withAccountId(String str) {
                this.accountId = str;
                return this;
            }

            public Builder withBeaconKey(String str) {
                this.beaconKey = str;
                return this;
            }

            public Builder withDisallowLocationCollection(boolean z) {
                this.disallowLocationCollection = z;
                return this;
            }

            public Builder withServerUrlFormat(String str) {
                this.serverUrlFormat = str;
                return this;
            }

            public Builder() {
                this.serverUrlFormat = Config.DEFAULT_SERVER_URL_FORMAT;
            }
        }
    }

    public static void resume(Context context) {
        resume(context, null);
    }

    public static void open(Context context, String str) {
        open(context, null, str);
    }

    public static void open(Context context, Config config) {
        open(context, config, null);
    }

    public static void open(Context context) {
        open(context, null, null);
    }
}
