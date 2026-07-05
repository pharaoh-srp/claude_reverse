package defpackage;

import android.util.StatsEvent;
import android.util.StatsLog;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dc5 {
    public static void a(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
        StatsEvent.Builder builderNewBuilder = StatsEvent.newBuilder();
        builderNewBuilder.setAtomId(762);
        builderNewBuilder.writeLong(j);
        builderNewBuilder.writeInt(i);
        builderNewBuilder.writeInt(i2);
        builderNewBuilder.writeInt(i3);
        builderNewBuilder.writeInt(i4);
        builderNewBuilder.writeInt(i5);
        builderNewBuilder.writeInt(i6);
        builderNewBuilder.writeInt(i7);
        builderNewBuilder.writeInt(i8);
        builderNewBuilder.writeInt(i9);
        builderNewBuilder.writeInt(i10);
        builderNewBuilder.writeInt(i11);
        builderNewBuilder.writeInt(i12);
        builderNewBuilder.writeInt(i13);
        builderNewBuilder.addBooleanAnnotation((byte) 1, true);
        builderNewBuilder.usePooledBuffer();
        StatsLog.write(builderNewBuilder.build());
    }
}
