package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s41 {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof s41);
    }

    public final int hashCode() {
        return Integer.hashCode(20) + vb7.c(96000, vb7.c(1, Integer.hashCode(16000) * 31, 31), 31);
    }

    public final String toString() {
        return "Opus(sampleRate=16000, channelCount=1, bitRate=96000, frameDurationMs=20)";
    }
}
