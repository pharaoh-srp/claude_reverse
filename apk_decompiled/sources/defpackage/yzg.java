package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lyzg;", "Lnqb;", "Le0h;", "ui"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class yzg extends nqb {
    public final Object E;
    public final Object F;
    public final Object[] G;
    public final PointerInputEventHandler H;

    public yzg(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i) {
        obj = (i & 1) != 0 ? null : obj;
        obj2 = (i & 2) != 0 ? null : obj2;
        objArr = (i & 4) != 0 ? null : objArr;
        this.E = obj;
        this.F = obj2;
        this.G = objArr;
        this.H = pointerInputEventHandler;
    }

    @Override // defpackage.nqb
    public final hqb create() {
        return new e0h(this.E, this.F, this.G, this.H);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yzg)) {
            return false;
        }
        yzg yzgVar = (yzg) obj;
        if (!x44.r(this.E, yzgVar.E) || !x44.r(this.F, yzgVar.F)) {
            return false;
        }
        Object[] objArr = yzgVar.G;
        Object[] objArr2 = this.G;
        if (objArr2 != null) {
            if (objArr == null || !Arrays.equals(objArr2, objArr)) {
                return false;
            }
        } else if (objArr != null) {
            return false;
        }
        return this.H == yzgVar.H;
    }

    public final int hashCode() {
        Object obj = this.E;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.F;
        int iHashCode2 = (iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.G;
        return this.H.hashCode() + ((iHashCode2 + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31);
    }

    @Override // defpackage.nqb
    public final void update(hqb hqbVar) {
        e0h e0hVar = (e0h) hqbVar;
        Object obj = e0hVar.S;
        Object obj2 = this.E;
        boolean z = !x44.r(obj, obj2);
        e0hVar.S = obj2;
        Object obj3 = e0hVar.T;
        Object obj4 = this.F;
        if (!x44.r(obj3, obj4)) {
            z = true;
        }
        e0hVar.T = obj4;
        Object[] objArr = e0hVar.U;
        Object[] objArr2 = this.G;
        if (objArr != null && objArr2 == null) {
            z = true;
        }
        if (objArr == null && objArr2 != null) {
            z = true;
        }
        if (objArr != null && objArr2 != null && !Arrays.equals(objArr2, objArr)) {
            z = true;
        }
        e0hVar.U = objArr2;
        Class<?> cls = e0hVar.W.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.H;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            e0hVar.r1();
        }
        e0hVar.W = pointerInputEventHandler;
    }
}
