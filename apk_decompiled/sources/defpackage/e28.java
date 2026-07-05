package defpackage;

import androidx.glance.appwidget.protobuf.UninitializedMessageException;
import androidx.glance.appwidget.protobuf.f;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e28 implements Cloneable {
    public final f E;
    public f F;

    public e28(f fVar) {
        this.E = fVar;
        if (fVar.f()) {
            sz6.p("Default instance must be immutable.");
            throw null;
        }
        this.F = fVar.h();
    }

    public static void d(Object obj, Object obj2) {
        nud nudVar = nud.c;
        nudVar.getClass();
        nudVar.a(obj.getClass()).a(obj, obj2);
    }

    public final f a() {
        f fVarB = b();
        fVarB.getClass();
        if (f.e(fVarB, true)) {
            return fVarB;
        }
        throw new UninitializedMessageException();
    }

    public final f b() {
        boolean zF = this.F.f();
        f fVar = this.F;
        if (!zF) {
            return fVar;
        }
        fVar.getClass();
        nud nudVar = nud.c;
        nudVar.getClass();
        nudVar.a(fVar.getClass()).b(fVar);
        fVar.g();
        return this.F;
    }

    public final void c() {
        if (this.F.f()) {
            return;
        }
        f fVarH = this.E.h();
        d(fVarH, this.F);
        this.F = fVarH;
    }

    public final Object clone() {
        e28 e28Var = (e28) this.E.b(5);
        e28Var.F = b();
        return e28Var;
    }
}
