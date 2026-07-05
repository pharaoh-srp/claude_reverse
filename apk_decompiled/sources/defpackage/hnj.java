package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
public final class hnj extends omj {
    public final j5h b;
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hnj(dba dbaVar, j5h j5hVar) {
        this(4, j5hVar);
        this.c = 1;
        this.d = dbaVar;
    }

    private final /* bridge */ /* synthetic */ void i(cbf cbfVar, boolean z) {
    }

    private final /* bridge */ /* synthetic */ void j(cbf cbfVar, boolean z) {
    }

    @Override // defpackage.pnj
    public final void a(Status status) {
        this.b.c(new ApiException(status));
    }

    @Override // defpackage.pnj
    public final void b(Exception exc) {
        this.b.c(exc);
    }

    @Override // defpackage.pnj
    public final void c(kmj kmjVar) throws DeadObjectException {
        try {
            h(kmjVar);
        } catch (DeadObjectException e) {
            a(pnj.e(e));
            throw e;
        } catch (RemoteException e2) {
            a(pnj.e(e2));
        } catch (RuntimeException e3) {
            this.b.c(e3);
        }
    }

    @Override // defpackage.pnj
    public final /* bridge */ /* synthetic */ void d(cbf cbfVar, boolean z) {
        int i = this.c;
    }

    @Override // defpackage.omj
    public final boolean f(kmj kmjVar) {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                return ((vmj) obj).a.a;
            default:
                vmj vmjVar = (vmj) kmjVar.n.get((dba) obj);
                return vmjVar != null && vmjVar.a.a;
        }
    }

    @Override // defpackage.omj
    public final jf7[] g(kmj kmjVar) {
        switch (this.c) {
            default:
            case 0:
                return null;
        }
    }

    public final void h(kmj kmjVar) {
        switch (this.c) {
            case 0:
                ((vmj) this.d).a.a(kmjVar.j, this.b);
                dba dbaVar = ((fba) ((vmj) this.d).a.c).c;
                if (dbaVar != null) {
                    kmjVar.n.put(dbaVar, (vmj) this.d);
                }
                break;
            default:
                j5h j5hVar = this.b;
                vmj vmjVar = (vmj) kmjVar.n.remove((dba) this.d);
                if (vmjVar == null) {
                    j5hVar.d(Boolean.FALSE);
                } else {
                    ((m11) ((w1c) vmjVar.b.G).d).accept(kmjVar.j, j5hVar);
                    fba fbaVar = (fba) vmjVar.a.c;
                    fbaVar.b = null;
                    fbaVar.c = null;
                }
                break;
        }
    }

    public hnj(int i, j5h j5hVar) {
        super(i);
        this.b = j5hVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hnj(vmj vmjVar, j5h j5hVar) {
        this(3, j5hVar);
        this.c = 0;
        this.d = vmjVar;
    }
}
