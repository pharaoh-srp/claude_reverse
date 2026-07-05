package defpackage;

import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import androidx.datastore.preferences.protobuf.f;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class j28 implements Cloneable {
    public final f E;
    public f F;

    public j28(f fVar) {
        this.E = fVar;
        if (fVar.f()) {
            sz6.p("Default instance must be immutable.");
            throw null;
        }
        this.F = fVar.i();
    }

    public static void d(int i, List list) {
        String str = "Element at index " + (list.size() - i) + " is null.";
        for (int size = list.size() - 1; size >= i; size--) {
            list.remove(size);
        }
        throw new NullPointerException(str);
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
        fVar.g();
        return this.F;
    }

    public final void c() {
        if (this.F.f()) {
            return;
        }
        f fVarI = this.E.i();
        f fVar = this.F;
        sud sudVar = sud.c;
        sudVar.getClass();
        sudVar.a(fVarI.getClass()).a(fVarI, fVar);
        this.F = fVarI;
    }

    public final Object clone() {
        j28 j28Var = (j28) this.E.b(5);
        j28Var.F = b();
        return j28Var;
    }
}
