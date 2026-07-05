package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fy7 extends ey7 {
    public long f;
    public long g;

    @Override // defpackage.ey7
    public final boolean equals(Object obj) {
        if (!(obj instanceof fy7) || !super.equals(obj)) {
            return false;
        }
        fy7 fy7Var = (fy7) obj;
        return this.f == fy7Var.f && this.g == fy7Var.g;
    }

    @Override // defpackage.ey7
    public final int hashCode() {
        return Long.hashCode(this.g) + (Long.hashCode(this.f) * 31) + (super.hashCode() * 31);
    }

    @Override // defpackage.ey7
    public final String toString() {
        return "FrameData(frameStartNanos=" + this.b + ", frameDurationUiNanos=" + this.c + ", frameDurationCpuNanos=" + this.e + ", frameDurationTotalNanos=" + this.f + ", frameOverrunNanos=" + this.g + ", isJank=" + this.d + ", states=" + this.a + ')';
    }
}
