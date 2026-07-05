package defpackage;

import android.os.Parcelable;
import androidx.health.platform.client.proto.a;
import androidx.health.platform.client.proto.m;

/* JADX INFO: loaded from: classes2.dex */
public final class hu6 extends lud {
    public static final Parcelable.Creator<hu6> CREATOR = new dpj(25);
    public final int F;
    public final String G;
    public final u0h H = new u0h(new v01(14, this));

    public hu6(int i, String str) {
        this.F = i;
        this.G = str;
    }

    @Override // defpackage.lud
    public final a a() {
        Object value = this.H.getValue();
        value.getClass();
        return (m) value;
    }
}
