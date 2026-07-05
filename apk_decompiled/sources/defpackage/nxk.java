package defpackage;

import com.google.android.gms.internal.measurement.n0;
import com.google.android.gms.internal.measurement.zzlk;
import com.google.android.gms.internal.measurement.zznu;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class nxk implements Cloneable {
    public final n0 E;
    public n0 F;

    public nxk(n0 n0Var) {
        this.E = n0Var;
        if (n0Var.o()) {
            sz6.p("Default instance must be immutable.");
            throw null;
        }
        this.F = (n0) n0Var.e(4);
    }

    public final nxk a(n0 n0Var) {
        n0 n0Var2 = this.E;
        if (n0Var2.equals(n0Var)) {
            return this;
        }
        if (!this.F.o()) {
            n0 n0Var3 = (n0) n0Var2.e(4);
            n0 n0Var4 = this.F;
            ozk ozkVar = ozk.c;
            ozkVar.getClass();
            ozkVar.a(n0Var3.getClass()).f(n0Var3, n0Var4);
            this.F = n0Var3;
        }
        n0 n0Var5 = this.F;
        ozk ozkVar2 = ozk.c;
        ozkVar2.getClass();
        ozkVar2.a(n0Var5.getClass()).f(n0Var5, n0Var);
        return this;
    }

    public final n0 b() {
        boolean zO = this.F.o();
        n0 n0Var = this.F;
        if (zO) {
            n0Var.m();
            n0Var = this.F;
        }
        boolean zA = true;
        byte bByteValue = ((Byte) n0Var.e(1)).byteValue();
        if (bByteValue != 1) {
            if (bByteValue == 0) {
                zA = false;
            } else {
                ozk ozkVar = ozk.c;
                ozkVar.getClass();
                zA = ozkVar.a(n0Var.getClass()).a(n0Var);
                n0Var.e(2);
            }
        }
        if (zA) {
            return n0Var;
        }
        throw new zznu();
    }

    public final void c() {
        if (this.F.o()) {
            return;
        }
        n0 n0Var = (n0) this.E.e(4);
        n0 n0Var2 = this.F;
        ozk ozkVar = ozk.c;
        ozkVar.getClass();
        ozkVar.a(n0Var.getClass()).f(n0Var, n0Var2);
        this.F = n0Var;
    }

    public final Object clone() {
        nxk nxkVar = (nxk) this.E.e(5);
        boolean zO = this.F.o();
        n0 n0Var = this.F;
        if (zO) {
            n0Var.m();
            n0Var = this.F;
        }
        nxkVar.F = n0Var;
        return nxkVar;
    }

    public final void d(byte[] bArr, int i, fwk fwkVar) throws zzlk {
        if (!this.F.o()) {
            n0 n0Var = (n0) this.E.e(4);
            n0 n0Var2 = this.F;
            ozk ozkVar = ozk.c;
            ozkVar.getClass();
            ozkVar.a(n0Var.getClass()).f(n0Var, n0Var2);
            this.F = n0Var;
        }
        try {
            ozk ozkVar2 = ozk.c;
            n0 n0Var3 = this.F;
            ozkVar2.getClass();
            b0l b0lVarA = ozkVar2.a(n0Var3.getClass());
            n0 n0Var4 = this.F;
            usk uskVar = new usk();
            fwkVar.getClass();
            b0lVarA.b(n0Var4, bArr, 0, i, uskVar);
        } catch (zzlk e) {
            throw e;
        } catch (IOException e2) {
            xh6.f("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzlk.d();
        }
    }
}
