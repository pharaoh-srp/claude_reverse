package defpackage;

import com.anthropic.claude.conway.protocol.ConwayForkMeta;
import com.anthropic.claude.types.strings.ForkId;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wx4 extends pd implements rz7, uzg {
    public static final wx4 L = new wx4(3, cw4.class, "buildForkRows", "buildForkRows(Lcom/anthropic/claude/conway/ConwayForksUiState;Ljava/util/Map;)Ljava/util/List;", 5);

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        dw4 dw4Var = (dw4) obj;
        Map map = (Map) obj2;
        ide ideVar = cw4.a;
        dw4Var.getClass();
        map.getClass();
        List<ConwayForkMeta> listI1 = w44.i1(dw4Var.a, new mt7(24));
        ArrayList arrayList = new ArrayList(x44.y(listI1, 10));
        for (ConwayForkMeta conwayForkMeta : listI1) {
            String strM737getAgentIdjXBynNE = conwayForkMeta.m737getAgentIdjXBynNE();
            String strB = cw4.b(conwayForkMeta.getLabel());
            if (strB == null) {
                strB = conwayForkMeta.m737getAgentIdjXBynNE();
            }
            arrayList.add(cw4.a(map, dw4Var, strM737getAgentIdjXBynNE, strB));
        }
        ForkId.Companion.getClass();
        return w44.b1(arrayList, cw4.a(map, dw4Var, ForkId.MAIN, ForkId.MAIN));
    }
}
