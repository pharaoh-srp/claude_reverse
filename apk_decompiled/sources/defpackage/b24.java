package defpackage;

import android.content.Context;
import com.anthropic.claude.code.remote.i;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class b24 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public int G;
    public Serializable H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b24(String str, int i, LinkedHashMap linkedHashMap, Map map, i iVar, String str2, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 0;
        this.H = str;
        this.G = i;
        this.J = linkedHashMap;
        this.K = map;
        this.L = iVar;
        this.I = str2;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.L;
        Object obj3 = this.K;
        Object obj4 = this.J;
        Object obj5 = this.I;
        switch (i) {
            case 0:
                return new b24((String) this.H, this.G, (LinkedHashMap) obj4, (Map) obj3, (i) obj2, (String) obj5, tp4Var);
            case 1:
                return new b24((vza) obj5, (AtomicInteger) obj4, (nwb) obj3, (isc) obj2, tp4Var, 1);
            default:
                return new b24((ho3) obj5, (Context) obj4, (jna) obj3, (nwb) obj2, tp4Var, 2);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((b24) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        if (r2 == r9) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        if (((java.lang.Boolean) r2).booleanValue() != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011a A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00c8 -> B:44:0x00c9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x00fe -> B:17:0x003c). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b24.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b24(Object obj, Object obj2, Object obj3, nwb nwbVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.I = obj;
        this.J = obj2;
        this.K = obj3;
        this.L = nwbVar;
    }
}
