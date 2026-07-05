package defpackage;

import android.os.Parcelable;
import androidx.health.platform.client.proto.a;
import androidx.health.platform.client.proto.u;

/* JADX INFO: loaded from: classes2.dex */
public final class c3e extends lud {
    public static final Parcelable.Creator<c3e> CREATOR = new s38(14);
    public final u F;

    public c3e(u uVar) {
        this.F = uVar;
    }

    @Override // defpackage.lud
    public final a a() {
        return this.F;
    }
}
