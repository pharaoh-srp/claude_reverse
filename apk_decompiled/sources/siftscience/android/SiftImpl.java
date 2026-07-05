package siftscience.android;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.gson.JsonSyntaxException;
import com.sift.api.representations.MobileEventJson;
import defpackage.ij0;
import defpackage.sz6;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import siftscience.android.Queue;
import siftscience.android.Sift;
import siftscience.android.Uploader;

/* JADX INFO: loaded from: classes.dex */
class SiftImpl {
    static final String APP_STATE_QUEUE_IDENTIFIER = "siftscience.android.app";
    private static final String ARCHIVE_NAME = "siftscience";
    static final String DEVICE_PROPERTIES_QUEUE_IDENTIFIER = "siftscience.android.device";
    private static final String TAG = "siftscience.android.SiftImpl";
    private final SharedPreferences archives;
    private Sift.Config config;
    private final Uploader.ConfigProvider configProvider;
    private final Map<String, Queue> queues;
    private final TaskManager taskManager;
    private final Queue.UploadRequester uploadRequester;
    private final Uploader uploader;
    private String userId;
    private final Queue.UserIdProvider userIdProvider;
    private static final Queue.Config DEVICE_PROPERTIES_QUEUE_CONFIG = new Queue.Config.Builder().withAcceptSameEventAfter(3600000).withUploadWhenMoreThan(0).withUploadWhenOlderThan(60000).build();
    private static final Queue.Config APP_STATE_QUEUE_CONFIG = new Queue.Config.Builder().withUploadWhenMoreThan(8).withUploadWhenOlderThan(60000).build();

    public class AppendTask implements Runnable {
        private MobileEventJson event;
        private String queueIdentifier;

        public AppendTask(String str, MobileEventJson mobileEventJson) {
            this.queueIdentifier = str;
            this.event = mobileEventJson;
        }

        @Override // java.lang.Runnable
        public void run() {
            Queue queue = SiftImpl.this.getQueue(this.queueIdentifier);
            if (queue != null) {
                queue.append(this.event);
            }
        }
    }

    public enum ArchiveKey {
        CONFIG("config"),
        USER_ID("user_id"),
        QUEUE("queue");

        public final String key;

        ArchiveKey(String str) {
            this.key = str;
        }

        public static String getKeyForQueueIdentifier(String str) {
            return ij0.C(QUEUE.key, "/", str);
        }

        public static String getQueueIdentifier(String str) {
            int iIndexOf;
            if (str.startsWith(QUEUE.key) && (iIndexOf = str.indexOf(47)) != -1) {
                return str.substring(iIndexOf + 1);
            }
            return null;
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public class ArchiveTask implements Runnable {
        private ArchiveTask() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SharedPreferences.Editor editorEdit = SiftImpl.this.archives.edit();
            editorEdit.clear();
            try {
                editorEdit.putString(ArchiveKey.CONFIG.key, SiftImpl.this.archiveConfig());
                String unused = SiftImpl.TAG;
                new StringBuilder("Archived Sift.Config: ").append(SiftImpl.this.archiveConfig());
                editorEdit.putString(ArchiveKey.USER_ID.key, SiftImpl.this.getUserId());
                String unused2 = SiftImpl.TAG;
                new StringBuilder("Archived User ID: ").append(SiftImpl.this.getUserId());
                for (Map.Entry entry : SiftImpl.this.queues.entrySet()) {
                    String keyForQueueIdentifier = ArchiveKey.getKeyForQueueIdentifier((String) entry.getKey());
                    String unused3 = SiftImpl.TAG;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Archived ");
                    sb.append(keyForQueueIdentifier);
                    sb.append(" Queue");
                    editorEdit.putString(keyForQueueIdentifier, ((Queue) entry.getValue()).archive());
                }
            } finally {
                editorEdit.apply();
            }
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public class ForceUploadTask implements Runnable {
        private String queueIdentifier;

        public ForceUploadTask(String str) {
            this.queueIdentifier = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Queue queue = SiftImpl.this.getQueue(this.queueIdentifier);
            if (queue != null) {
                queue.forceUpload();
            }
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public class SetConfigTask implements Runnable {
        private Sift.Config config;

        public SetConfigTask(Sift.Config config) {
            this.config = config;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                SiftImpl.this.config = this.config;
            }
        }
    }

    public class SetUserIdTask implements Runnable {
        private String userId;

        public SetUserIdTask(String str) {
            this.userId = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                SiftImpl.this.userId = this.userId;
            }
        }
    }

    public class UnarchiveTask implements Runnable {
        private final boolean hasUnboundUserId;

        public UnarchiveTask(boolean z) {
            this.hasUnboundUserId = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SiftImpl.this.config == null) {
                String string = SiftImpl.this.archives.getString(ArchiveKey.CONFIG.key, null);
                SiftImpl siftImpl = SiftImpl.this;
                siftImpl.config = siftImpl.unarchiveConfig(string);
                String unused = SiftImpl.TAG;
                new StringBuilder("Unarchived Sift.Config: ").append(string);
            }
            if (!this.hasUnboundUserId) {
                SiftImpl siftImpl2 = SiftImpl.this;
                siftImpl2.userId = siftImpl2.archives.getString(ArchiveKey.USER_ID.key, null);
                String unused2 = SiftImpl.TAG;
                new StringBuilder("Unarchived User ID: ").append(SiftImpl.this.userId);
            }
            for (Map.Entry<String, ?> entry : SiftImpl.this.archives.getAll().entrySet()) {
                String queueIdentifier = ArchiveKey.getQueueIdentifier(entry.getKey());
                String str = (String) entry.getValue();
                if (queueIdentifier != null) {
                    if (queueIdentifier.equals(SiftImpl.DEVICE_PROPERTIES_QUEUE_IDENTIFIER)) {
                        Queue queue = new Queue(str, SiftImpl.this.userIdProvider, SiftImpl.this.uploadRequester, SiftImpl.DEVICE_PROPERTIES_QUEUE_CONFIG);
                        String unused3 = SiftImpl.TAG;
                        SiftImpl.this.queues.put(queueIdentifier, queue);
                    }
                    if (queueIdentifier.equals(SiftImpl.APP_STATE_QUEUE_IDENTIFIER)) {
                        Queue queue2 = new Queue(str, SiftImpl.this.userIdProvider, SiftImpl.this.uploadRequester, SiftImpl.APP_STATE_QUEUE_CONFIG);
                        String unused4 = SiftImpl.TAG;
                        SiftImpl.this.queues.put(queueIdentifier, queue2);
                    }
                }
            }
            if (!SiftImpl.this.queues.containsKey(SiftImpl.DEVICE_PROPERTIES_QUEUE_IDENTIFIER)) {
                SiftImpl.this.createQueue(SiftImpl.DEVICE_PROPERTIES_QUEUE_IDENTIFIER, SiftImpl.DEVICE_PROPERTIES_QUEUE_CONFIG);
            }
            if (SiftImpl.this.queues.containsKey(SiftImpl.APP_STATE_QUEUE_IDENTIFIER)) {
                return;
            }
            SiftImpl.this.createQueue(SiftImpl.APP_STATE_QUEUE_IDENTIFIER, SiftImpl.APP_STATE_QUEUE_CONFIG);
        }
    }

    public SiftImpl(Context context, Sift.Config config, String str, boolean z, TaskManager taskManager) {
        this.userIdProvider = new Queue.UserIdProvider() { // from class: siftscience.android.SiftImpl.1
            @Override // siftscience.android.Queue.UserIdProvider
            public String getUserId() {
                return SiftImpl.this.getUserId();
            }
        };
        this.uploadRequester = new Queue.UploadRequester() { // from class: siftscience.android.SiftImpl.2
            @Override // siftscience.android.Queue.UploadRequester
            public void requestUpload(List<MobileEventJson> list) {
                SiftImpl.this.upload(list);
            }
        };
        Uploader.ConfigProvider configProvider = new Uploader.ConfigProvider() { // from class: siftscience.android.SiftImpl.3
            @Override // siftscience.android.Uploader.ConfigProvider
            public Sift.Config getConfig() {
                return SiftImpl.this.getConfig();
            }
        };
        this.configProvider = configProvider;
        this.archives = context.getSharedPreferences(ARCHIVE_NAME, 0);
        this.taskManager = taskManager;
        this.config = config;
        if (z) {
            this.userId = str;
            new StringBuilder("Using unbound User ID: ").append(str);
        }
        this.queues = new HashMap();
        this.uploader = new Uploader(taskManager, configProvider);
        taskManager.submit(new UnarchiveTask(z));
    }

    public void appendAppStateEvent(MobileEventJson mobileEventJson) {
        this.taskManager.submit(new AppendTask(APP_STATE_QUEUE_IDENTIFIER, mobileEventJson));
    }

    public void appendDevicePropertiesEvent(MobileEventJson mobileEventJson) {
        this.taskManager.submit(new AppendTask(DEVICE_PROPERTIES_QUEUE_IDENTIFIER, mobileEventJson));
    }

    public String archiveConfig() {
        return Sift.GSON.e(this.config);
    }

    public Queue createQueue(String str, Queue.Config config) {
        if (getQueue(str) != null) {
            sz6.j(ij0.i("Queue exists: ", str));
            return null;
        }
        Queue queue = new Queue(null, this.userIdProvider, this.uploadRequester, config);
        this.queues.put(str, queue);
        Log.i(TAG, "Created new " + str + " queue");
        return queue;
    }

    public void forceUploadAppStateEvent() {
        this.taskManager.submit(new ForceUploadTask(APP_STATE_QUEUE_IDENTIFIER));
    }

    public void forceUploadDevicePropertiesEvent() {
        this.taskManager.submit(new ForceUploadTask(DEVICE_PROPERTIES_QUEUE_IDENTIFIER));
    }

    public synchronized Sift.Config getConfig() {
        Sift.Config config = this.config;
        if (config != null) {
            return config;
        }
        return unarchiveConfig(this.archives.getString(ArchiveKey.CONFIG.key, null));
    }

    public Queue getQueue(String str) {
        return this.queues.get(str);
    }

    public synchronized String getUserId() {
        return this.userId;
    }

    public void save() {
        this.taskManager.submit(new ArchiveTask());
    }

    public void setConfig(Sift.Config config) {
        this.taskManager.submit(new SetConfigTask(config));
    }

    public void setUserId(String str) {
        this.taskManager.submit(new SetUserIdTask(str));
    }

    public void stop() {
        this.taskManager.shutdown();
    }

    public Sift.Config unarchiveConfig(String str) {
        if (str == null) {
            Sift.Config config = this.config;
            return config == null ? new Sift.Config() : config;
        }
        try {
            return (Sift.Config) Sift.GSON.b(Sift.Config.class, str);
        } catch (JsonSyntaxException unused) {
            Sift.Config config2 = this.config;
            return config2 == null ? new Sift.Config() : config2;
        }
    }

    public void unsetUserId() {
        this.taskManager.submit(new SetUserIdTask(null));
    }

    public void upload(List<MobileEventJson> list) {
        this.uploader.upload(list);
    }

    public SiftImpl(Context context, Sift.Config config, String str, boolean z) {
        this(context, config, str, z, new TaskManager());
    }
}
