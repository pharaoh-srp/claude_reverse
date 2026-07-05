package androidx.health.platform.client.permission;

import android.os.Parcelable;
import androidx.health.platform.client.proto.a;
import androidx.health.platform.client.proto.r;
import defpackage.lud;
import defpackage.mdj;
import defpackage.s38;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/health/platform/client/permission/Permission;", "Llud;", "Landroidx/health/platform/client/proto/r;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = mdj.f)
public final class Permission extends lud {
    public static final Parcelable.Creator<Permission> CREATOR = new s38(12);
    public final r F;

    public Permission(r rVar) {
        rVar.getClass();
        this.F = rVar;
    }

    @Override // defpackage.lud
    public final a a() {
        return this.F;
    }
}
