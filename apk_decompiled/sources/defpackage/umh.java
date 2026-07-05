package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.anthropic.claude.analytics.events.ThirdPartyToolEvents$ThirdPartyToolExecuted;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class umh extends Binder implements IInterface {
    public final /* synthetic */ n4 i;
    public final /* synthetic */ xmh j;
    public final /* synthetic */ AtomicBoolean k;
    public final /* synthetic */ long l;
    public final /* synthetic */ ua2 m;
    public final /* synthetic */ vmh n;

    public umh(n4 n4Var, xmh xmhVar, AtomicBoolean atomicBoolean, long j, ua2 ua2Var, vmh vmhVar) {
        this.i = n4Var;
        this.j = xmhVar;
        this.k = atomicBoolean;
        this.l = j;
        this.m = ua2Var;
        this.n = vmhVar;
        attachInterface(this, "com.anthropic.claude.tool.thirdparty.IToolExecutionCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("com.anthropic.claude.tool.thirdparty.IToolExecutionCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("com.anthropic.claude.tool.thirdparty.IToolExecutionCallback");
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        parcel.readString();
        String string = parcel.readString();
        boolean z = parcel.readInt() != 0;
        this.i.a();
        xmh xmhVar = this.j;
        if (string == null) {
            string = ij0.j("No response from ", xmhVar.f, ".");
        }
        if (!z) {
            this.n.invoke("remote_error", string);
            return true;
        }
        if (this.k.compareAndSet(false, true)) {
            xmhVar.i.e(new ThirdPartyToolEvents$ThirdPartyToolExecuted(xmhVar.e, xmhVar.k, xmhVar.j.a() - this.l), ThirdPartyToolEvents$ThirdPartyToolExecuted.Companion.serializer());
            this.m.resumeWith(new exh(string, true));
        }
        return true;
    }
}
