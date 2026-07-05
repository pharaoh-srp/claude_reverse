package siftscience.android;

/* JADX INFO: loaded from: classes.dex */
class Time {
    static long currentTime;

    public static long now() {
        long j = currentTime;
        return j != 0 ? j : System.currentTimeMillis();
    }
}
