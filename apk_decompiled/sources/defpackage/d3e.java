package defpackage;

import android.os.Parcelable;
import androidx.health.platform.client.proto.a;
import androidx.health.platform.client.proto.x;

/* JADX INFO: loaded from: classes2.dex */
public final class d3e extends lud {
    public static final Parcelable.Creator<d3e> CREATOR = new s38(15);
    public final x F;

    public d3e(x xVar) {
        this.F = xVar;
    }

    @Override // defpackage.lud
    public final a a() {
        return this.F;
    }
}
