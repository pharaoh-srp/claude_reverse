package defpackage;

import com.google.crypto.tink.shaded.protobuf.UninitializedMessageException;
import com.google.crypto.tink.shaded.protobuf.f;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g28 implements bib, Cloneable {
    public final f E;
    public f F;

    public g28(f fVar) {
        this.E = fVar;
        if (fVar.n()) {
            sz6.p("Default instance must be immutable.");
            throw null;
        }
        this.F = fVar.q();
    }

    public static void g(Object obj, Object obj2) {
        pud pudVar = pud.c;
        pudVar.getClass();
        pudVar.a(obj.getClass()).a(obj, obj2);
    }

    public final f b() {
        f fVarC = c();
        fVarC.getClass();
        if (f.m(fVarC, true)) {
            return fVarC;
        }
        throw new UninitializedMessageException();
    }

    public final f c() {
        boolean zN = this.F.n();
        f fVar = this.F;
        if (!zN) {
            return fVar;
        }
        fVar.getClass();
        pud pudVar = pud.c;
        pudVar.getClass();
        pudVar.a(fVar.getClass()).b(fVar);
        fVar.o();
        return this.F;
    }

    public final g28 d() {
        g28 g28VarD = this.E.d();
        g28VarD.F = c();
        return g28VarD;
    }

    public final void f() {
        if (this.F.n()) {
            return;
        }
        f fVarQ = this.E.q();
        g(fVarQ, this.F);
        this.F = fVarQ;
    }
}
