package defpackage;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class lbg implements Iterator {
    public final /* synthetic */ int E;
    public int F = -1;
    public boolean G;
    public Iterator H;
    public final /* synthetic */ AbstractMap I;

    public /* synthetic */ lbg(AbstractMap abstractMap, int i) {
        this.E = i;
        this.I = abstractMap;
    }

    public final Iterator a() {
        int i = this.E;
        AbstractMap abstractMap = this.I;
        switch (i) {
            case 0:
                if (this.H == null) {
                    this.H = ((dbg) abstractMap).F.entrySet().iterator();
                }
                break;
            default:
                if (this.H == null) {
                    this.H = ((fbg) abstractMap).G.entrySet().iterator();
                }
                break;
        }
        return this.H;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.E;
        AbstractMap abstractMap = this.I;
        switch (i) {
            case 0:
                dbg dbgVar = (dbg) abstractMap;
                if (this.F + 1 < dbgVar.E.size() || (!dbgVar.F.isEmpty() && a().hasNext())) {
                }
                break;
            default:
                fbg fbgVar = (fbg) abstractMap;
                if (this.F + 1 < fbgVar.F || (!fbgVar.G.isEmpty() && a().hasNext())) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.E;
        AbstractMap abstractMap = this.I;
        switch (i) {
            case 0:
                this.G = true;
                int i2 = this.F + 1;
                this.F = i2;
                dbg dbgVar = (dbg) abstractMap;
                if (i2 >= dbgVar.E.size()) {
                }
                break;
            default:
                this.G = true;
                int i3 = this.F + 1;
                this.F = i3;
                fbg fbgVar = (fbg) abstractMap;
                if (i3 >= fbgVar.F) {
                }
                break;
        }
        return (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.E;
        AbstractMap abstractMap = this.I;
        switch (i) {
            case 0:
                dbg dbgVar = (dbg) abstractMap;
                if (!this.G) {
                    sz6.j("remove() was called before next()");
                } else {
                    this.G = false;
                    int i2 = dbg.J;
                    dbgVar.c();
                    if (this.F >= dbgVar.E.size()) {
                        a().remove();
                    } else {
                        int i3 = this.F;
                        this.F = i3 - 1;
                        dbgVar.i(i3);
                    }
                }
                break;
            default:
                fbg fbgVar = (fbg) abstractMap;
                if (!this.G) {
                    sz6.j("remove() was called before next()");
                } else {
                    this.G = false;
                    int i4 = fbg.K;
                    fbgVar.c();
                    int i5 = this.F;
                    if (i5 >= fbgVar.F) {
                        a().remove();
                    } else {
                        this.F = i5 - 1;
                        fbgVar.i(i5);
                    }
                }
                break;
        }
    }
}
