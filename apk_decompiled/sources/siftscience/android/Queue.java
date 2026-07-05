package siftscience.android;

import com.google.gson.JsonSyntaxException;
import com.sift.api.representations.MobileEventJson;
import defpackage.aof;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Queue {
    private static final String TAG = "siftscience.android.Queue";
    private final Config config;
    private final State state;
    private final UploadRequester uploadRequester;
    private final UserIdProvider userIdProvider;

    public static class Config {

        @aof(alternate = {"acceptSameEventAfter"}, value = "accept_same_event_after")
        private final long acceptSameEventAfter;

        @aof(alternate = {"uploadWhenMoreThan"}, value = "upload_when_more_than")
        private final int uploadWhenMoreThan;

        @aof(alternate = {"uploadWhenOlderThan"}, value = "upload_when_older_than")
        private final long uploadWhenOlderThan;

        public static class Builder {
            private long acceptSameEventAfter = 0;
            private int uploadWhenMoreThan = 0;
            private long uploadWhenOlderThan = 0;

            public Config build() {
                return new Config(this.acceptSameEventAfter, this.uploadWhenMoreThan, this.uploadWhenOlderThan);
            }

            public Builder withAcceptSameEventAfter(long j) {
                this.acceptSameEventAfter = j;
                return this;
            }

            public Builder withUploadWhenMoreThan(int i) {
                this.uploadWhenMoreThan = i;
                return this;
            }

            public Builder withUploadWhenOlderThan(long j) {
                this.uploadWhenOlderThan = j;
                return this;
            }
        }

        private Config(long j, int i, long j2) {
            this.acceptSameEventAfter = j;
            this.uploadWhenMoreThan = i;
            this.uploadWhenOlderThan = j2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return this.acceptSameEventAfter == config.acceptSameEventAfter && this.uploadWhenMoreThan == config.uploadWhenMoreThan && this.uploadWhenOlderThan == config.uploadWhenOlderThan;
        }
    }

    public static class State {

        @aof("config")
        Config config;

        @aof("queue")
        List<MobileEventJson> queue = new ArrayList();

        @aof(alternate = {"lastEvent"}, value = "last_event")
        MobileEventJson lastEvent = null;

        @aof(alternate = {"lastUploadTimestamp"}, value = "last_upload_timestamp")
        long lastUploadTimestamp = 0;
    }

    public interface UploadRequester {
        void requestUpload(List<MobileEventJson> list);
    }

    public interface UserIdProvider {
        String getUserId();
    }

    public Queue(String str, UserIdProvider userIdProvider, UploadRequester uploadRequester, Config config) {
        this.state = unarchive(str);
        this.config = config;
        this.userIdProvider = userIdProvider;
        this.uploadRequester = uploadRequester;
    }

    public void append(MobileEventJson mobileEventJson) {
        MobileEventJson mobileEventJson2;
        long jNow = Time.now();
        if (mobileEventJson.userId == null) {
            mobileEventJson.userId = this.userIdProvider.getUserId();
        }
        if (this.config.acceptSameEventAfter > 0 && (mobileEventJson2 = this.state.lastEvent) != null) {
            if (jNow < this.config.acceptSameEventAfter + mobileEventJson2.time.longValue() && Utils.eventsAreBasicallyEqual(this.state.lastEvent, mobileEventJson)) {
                new StringBuilder("Drop duplicate event: ").append(mobileEventJson.toString());
                return;
            }
        }
        new StringBuilder("Append event: ").append(mobileEventJson.toString());
        this.state.queue.add(mobileEventJson);
        this.state.lastEvent = mobileEventJson;
        if (isReadyForUpload(jNow)) {
            this.state.lastUploadTimestamp = jNow;
            this.uploadRequester.requestUpload(flush());
        }
    }

    public String archive() {
        return Sift.GSON.e(this.state);
    }

    public List<MobileEventJson> flush() {
        State state = this.state;
        List<MobileEventJson> list = state.queue;
        state.queue = new ArrayList();
        return list;
    }

    public void forceUpload() {
        if (this.state.queue.isEmpty()) {
            return;
        }
        this.state.lastUploadTimestamp = Time.now();
        this.uploadRequester.requestUpload(flush());
    }

    public Config getConfig() {
        return this.config;
    }

    public boolean isReadyForUpload(long j) {
        if (this.state.queue.size() > this.config.uploadWhenMoreThan) {
            return true;
        }
        if (this.state.queue.isEmpty()) {
            return false;
        }
        return j > this.config.uploadWhenOlderThan + this.state.lastUploadTimestamp;
    }

    public State unarchive(String str) {
        if (str == null) {
            return new State();
        }
        try {
            return (State) Sift.GSON.b(State.class, str);
        } catch (JsonSyntaxException unused) {
            return new State();
        }
    }
}
