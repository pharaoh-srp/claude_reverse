package defpackage;

import androidx.compose.material3.internal.ripple.RippleNode;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.chat.ChatMessage;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.conway.protocol.b0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ku extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ boolean G;
    public /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ku(Object obj, Object obj2, boolean z, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = obj;
        this.I = obj2;
        this.G = z;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.I;
        switch (i) {
            case 0:
                return new ku((lu) this.H, (String) obj2, this.G, tp4Var, 0);
            case 1:
                return new ku((uv) this.H, (Project) obj2, this.G, tp4Var, 1);
            case 2:
                return new ku(this.G, (a80) this.H, (zy7) obj2, tp4Var, 2);
            case 3:
                return new ku((qb2) this.H, (McpServer) obj2, this.G, tp4Var, 3);
            case 4:
                return new ku((qb2) this.H, (hcb) obj2, this.G, tp4Var, 4);
            case 5:
                return new ku((uz2) this.H, (ChatMessage) obj2, this.G, tp4Var, 5);
            case 6:
                ku kuVar = new ku((t53) obj2, this.G, tp4Var);
                kuVar.H = obj;
                return kuVar;
            case 7:
                return new ku(this.G, (db3) this.H, (x3g) obj2, tp4Var, 7);
            case 8:
                return new ku(this.G, (uma) this.H, (ina) obj2, tp4Var, 8);
            case 9:
                return new ku(this.G, (mxd) this.H, (nwb) obj2, tp4Var, 9);
            case 10:
                return new ku(this.G, (yih) this.H, (bx1) obj2, tp4Var, 10);
            case 11:
                return new ku((b0) this.H, (String) obj2, this.G, tp4Var, 11);
            case 12:
                return new ku((p05) this.H, (String) obj2, this.G, tp4Var, 12);
            case 13:
                return new ku((ha7) this.H, (List) obj2, this.G, tp4Var, 13);
            case 14:
                return new ku((ybg) this.H, this.G, (ca9) obj2, tp4Var, 14);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return new ku((c9c) this.H, (g9c) obj2, this.G, tp4Var, 15);
            case 16:
                return new ku((ild) this.H, (String) obj2, this.G, tp4Var, 16);
            case g.MAX_FIELD_NUMBER /* 17 */:
                return new ku((RippleNode) this.H, this.G, (pue) obj2, tp4Var, 17);
            case g.AVG_FIELD_NUMBER /* 18 */:
                return new ku((a80) this.H, this.G, (yig) obj2, tp4Var, 18);
            default:
                return new ku((phg) this.H, this.G, (zy7) obj2, tp4Var, 19);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
        }
        return ((ku) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:217:0x043a, code lost:
    
        if (r0.Q(false, r23) == r13) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0443, code lost:
    
        if (defpackage.db3.O(r0, r23) == r13) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x06eb, code lost:
    
        if (defpackage.a80.c(r0, r1, r2, null, r23, 12) != r13) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:?, code lost:
    
        return r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:368:0x06d1  */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 1900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ku.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku(t53 t53Var, boolean z, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 6;
        this.I = t53Var;
        this.G = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ku(Object obj, boolean z, Object obj2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = obj;
        this.G = z;
        this.I = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ku(boolean z, Object obj, Object obj2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = z;
        this.H = obj;
        this.I = obj2;
    }
}
