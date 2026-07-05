package defpackage;

import android.os.Parcelable;
import androidx.health.platform.client.proto.a;
import androidx.health.platform.client.proto.v;

/* JADX INFO: loaded from: classes3.dex */
public final class aje extends lud {
    public static final Parcelable.Creator<aje> CREATOR = new s38(20);
    public final String F;
    public final int G;
    public final String H;
    public final boolean I;
    public final u0h J;

    public aje(String str, String str2, int i, boolean z) {
        str.getClass();
        this.F = str;
        this.G = i;
        this.H = str2;
        this.I = z;
        this.J = new u0h(new k2c(4, this));
    }

    @Override // defpackage.lud
    public final a a() {
        Object value = this.J.getValue();
        value.getClass();
        return (v) value;
    }
}
