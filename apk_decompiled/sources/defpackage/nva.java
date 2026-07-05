package defpackage;

import java.util.Iterator;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes.dex */
public final class nva extends w0 {
    public final /* synthetic */ int E;
    public final Object F;

    public /* synthetic */ nva(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    public hva a(int i) {
        Matcher matcher = ((ova) this.F).a;
        b79 b79VarH0 = wd6.H0(matcher.start(i), matcher.end(i));
        if (b79VarH0.E < 0) {
            return null;
        }
        String strGroup = matcher.group(i);
        strGroup.getClass();
        return new hva(strGroup, b79VarH0);
    }

    @Override // defpackage.w0, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.E) {
            case 0:
                if (obj == null ? true : obj instanceof hva) {
                    return super.contains((hva) obj);
                }
                return false;
            default:
                return ((jyc) this.F).containsValue(obj);
        }
    }

    @Override // defpackage.w0
    public final int getSize() {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                return ((ova) obj).a.groupCount() + 1;
            default:
                return ((jyc) obj).F;
        }
    }

    @Override // defpackage.w0, java.util.Collection, java.util.List
    public boolean isEmpty() {
        switch (this.E) {
            case 0:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = 0;
        switch (this.E) {
            case 0:
                return bnf.b0(new c54(i, x44.L(this)), new tl8(11, this)).iterator();
            default:
                x6i x6iVar = ((jyc) this.F).E;
                z6i[] z6iVarArr = new z6i[8];
                while (i < 8) {
                    z6iVarArr[i] = new b7i(1);
                    i++;
                }
                return new zyc(x6iVar, z6iVarArr);
        }
    }
}
