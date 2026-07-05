package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class tkg extends w9i {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tkg(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // defpackage.bbi
    public boolean a() {
        switch (this.c) {
            case 1:
                return false;
            default:
                return super.a();
        }
    }

    @Override // defpackage.bbi
    public boolean f() {
        switch (this.c) {
            case 1:
                return ((Map) this.d).isEmpty();
            default:
                return super.f();
        }
    }

    @Override // defpackage.w9i
    public final vai h(u9i u9iVar) {
        int i = this.c;
        Object obj = this.d;
        u9iVar.getClass();
        switch (i) {
            case 0:
                if (!((ArrayList) obj).contains(u9iVar)) {
                    return null;
                }
                xh3 xh3VarA = u9iVar.a();
                xh3VarA.getClass();
                return fbi.k((qai) xh3VarA);
            default:
                return (vai) ((Map) obj).get(u9iVar);
        }
    }
}
