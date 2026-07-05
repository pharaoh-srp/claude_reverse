package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface jo7 extends mb0 {
    @Override // defpackage.mb0
    default dsi a(c9i c9iVar) {
        return new dpf(this);
    }

    float b(long j, float f, float f2, float f3);

    long c(float f, float f2, float f3);

    default float d(float f, float f2, float f3) {
        return b(c(f, f2, f3), f, f2, f3);
    }

    float e(long j, float f, float f2, float f3);
}
