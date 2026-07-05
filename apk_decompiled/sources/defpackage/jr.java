package defpackage;

import android.os.Parcelable;
import androidx.health.platform.client.proto.a;
import androidx.health.platform.client.proto.s;

/* JADX INFO: loaded from: classes2.dex */
public final class jr extends lud {
    public static final Parcelable.Creator<jr> CREATOR = new dpj(2);
    public final s F;

    public jr(s sVar) {
        this.F = sVar;
    }

    @Override // defpackage.lud
    public final a a() {
        return this.F;
    }
}
