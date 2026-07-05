package defpackage;

import android.os.Bundle;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u0l extends rlj implements IInterface {
    public final sqb j;
    public final j5h k;
    public final /* synthetic */ m3l l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0l(m3l m3lVar, sqb sqbVar, j5h j5hVar) {
        super(8);
        this.l = m3lVar;
        attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        this.j = sqbVar;
        this.k = j5hVar;
    }

    public void H(Bundle bundle) {
        this.l.a.d(this.k);
        this.j.c("onCompleteUpdate", new Object[0]);
    }

    public void I(Bundle bundle) {
        this.l.a.d(this.k);
        this.j.c("onRequestInfo", new Object[0]);
    }
}
