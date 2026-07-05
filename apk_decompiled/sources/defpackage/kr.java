package defpackage;

import android.os.Parcelable;
import androidx.health.platform.client.proto.a;
import androidx.health.platform.client.proto.w;

/* JADX INFO: loaded from: classes2.dex */
public final class kr extends lud {
    public static final Parcelable.Creator<kr> CREATOR = new dpj(3);
    public final w F;

    public kr(w wVar) {
        this.F = wVar;
    }

    @Override // defpackage.lud
    public final a a() {
        return this.F;
    }
}
