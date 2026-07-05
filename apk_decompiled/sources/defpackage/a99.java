package defpackage;

import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class a99 extends rlj implements IInterface {
    public final /* synthetic */ int j;
    public final /* synthetic */ j5h k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a99(int i, j5h j5hVar) {
        super(3);
        this.j = i;
        this.k = j5hVar;
        attachInterface(this, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
    }
}
