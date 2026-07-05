package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class wyc extends c4 implements rz8 {
    public final /* synthetic */ int E;
    public final iyc F;

    public /* synthetic */ wyc(iyc iycVar, int i) {
        this.E = i;
        this.F = iycVar;
    }

    @Override // defpackage.w0, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.E;
        iyc iycVar = this.F;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object obj2 = iycVar.get(entry.getKey());
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && iycVar.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return iycVar.containsKey(obj);
        }
    }

    @Override // defpackage.w0
    public final int getSize() {
        int i = this.E;
        iyc iycVar = this.F;
        switch (i) {
        }
        return iycVar.F;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.E;
        iyc iycVar = this.F;
        switch (i) {
            case 0:
                w6i w6iVar = iycVar.E;
                w6iVar.getClass();
                y6i[] y6iVarArr = new y6i[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    y6iVarArr[i2] = new a7i(0);
                }
                return new yyc(w6iVar, y6iVarArr);
            default:
                w6i w6iVar2 = iycVar.E;
                w6iVar2.getClass();
                y6i[] y6iVarArr2 = new y6i[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    y6iVarArr2[i3] = new a7i(1);
                }
                return new yyc(w6iVar2, y6iVarArr2);
        }
    }
}
