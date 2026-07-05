package defpackage;

import java.time.Duration;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qr implements sr, zz7 {
    public static final qr F = new qr(0);
    public static final qr G = new qr(1);
    public final /* synthetic */ int E;

    public /* synthetic */ qr(int i) {
        this.E = i;
    }

    @Override // defpackage.zz7
    public final qz7 d() {
        switch (this.E) {
        }
        return new m08(1, Duration.class, "ofMillis", "ofMillis(J)Ljava/time/Duration;", 0);
    }

    public final boolean equals(Object obj) {
        switch (this.E) {
            case 0:
                if ((obj instanceof sr) && (obj instanceof zz7)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof sr) && (obj instanceof zz7)) {
                    break;
                }
                break;
        }
        return d().equals(((zz7) obj).d());
    }

    public final int hashCode() {
        switch (this.E) {
        }
        return d().hashCode();
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        switch (this.E) {
        }
        return Duration.ofMillis(((Number) obj).longValue());
    }
}
