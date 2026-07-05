package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class apk implements Callable {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ String G;
    public final /* synthetic */ String H;
    public final /* synthetic */ mnk I;

    public /* synthetic */ apk(mnk mnkVar, String str, String str2, String str3, int i) {
        this.E = i;
        this.F = str;
        this.G = str2;
        this.H = str3;
        this.I = mnkVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.E;
        String str = this.H;
        String str2 = this.G;
        String str3 = this.F;
        mnk mnkVar = this.I;
        switch (i) {
            case 0:
                o0l o0lVar = mnkVar.i;
                o0lVar.Z();
                wrj wrjVar = o0lVar.G;
                o0l.t(wrjVar);
                return wrjVar.z1(str3, str2, str);
            case 1:
                o0l o0lVar2 = mnkVar.i;
                o0lVar2.Z();
                wrj wrjVar2 = o0lVar2.G;
                o0l.t(wrjVar2);
                return wrjVar2.a1(str3, str2, str);
            case 2:
                o0l o0lVar3 = mnkVar.i;
                o0lVar3.Z();
                wrj wrjVar3 = o0lVar3.G;
                o0l.t(wrjVar3);
                return wrjVar3.z1(str3, str2, str);
            default:
                o0l o0lVar4 = mnkVar.i;
                o0lVar4.Z();
                wrj wrjVar4 = o0lVar4.G;
                o0l.t(wrjVar4);
                return wrjVar4.a1(str3, str2, str);
        }
    }
}
