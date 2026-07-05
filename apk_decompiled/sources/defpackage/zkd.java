package defpackage;

import androidx.health.platform.client.proto.g;
import androidx.work.impl.WorkerStoppedException;
import com.anthropic.claude.types.strings.ChatId;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zkd implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ zkd(Object obj, int i, Object obj2) {
        this.E = i;
        this.G = obj;
        this.F = obj2;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj2 = this.F;
        Object obj3 = this.G;
        switch (i) {
            case 0:
                return ((f7d) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 1:
                ((f7d) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
                return lc9.H;
            case 2:
                return ((f7d) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 3:
                return ((f7d) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 4:
                int iIntValue = ((Number) obj).intValue();
                return ((oua) obj3).invoke(Integer.valueOf(iIntValue), ((List) obj2).get(iIntValue));
            case 5:
                xd6 xd6Var = (xd6) obj;
                xd6Var.getClass();
                u00.p(xd6Var, (qg8) obj3, ((n8f) obj2).a, 0L, xd6Var.g());
                return ieiVar;
            case 6:
                return ((d6f) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 7:
                return ((z1g) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 8:
                ((z1g) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
                return kc9.F;
            case 9:
                return ((z1g) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 10:
                ((z1g) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
                return le6.F;
            case 11:
                return ((z1g) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 12:
                ((z1g) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
                return le6.E;
            case 13:
                return ((x2h) obj3).invoke(((mva) obj2).get(((Number) obj).intValue()));
            case 14:
                int iIntValue2 = ((Number) obj).intValue();
                return ((qte) obj3).invoke(Integer.valueOf(iIntValue2), ((List) obj2).get(iIntValue2));
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return ((x2h) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 16:
                String strM984unboximpl = ((ChatId) obj).m984unboximpl();
                strM984unboximpl.getClass();
                ((t4g) obj3).a();
                ((pz7) obj2).invoke(ChatId.m978boximpl(strM984unboximpl), null);
                return ieiVar;
            case g.MAX_FIELD_NUMBER /* 17 */:
                int iIntValue3 = ((Number) obj).intValue();
                return ((pz7) obj3).invoke(Integer.valueOf(iIntValue3), ((List) obj2).get(iIntValue3));
            case g.AVG_FIELD_NUMBER /* 18 */:
                int iIntValue4 = ((Number) obj).intValue();
                return ((jwh) obj3).invoke(Integer.valueOf(iIntValue4), ((List) obj2).get(iIntValue4));
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                int iIntValue5 = ((Number) obj).intValue();
                return ((hzh) obj3).invoke(Integer.valueOf(iIntValue5), ((List) obj2).get(iIntValue5));
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                int iIntValue6 = ((Number) obj).intValue();
                return ((hzh) obj3).invoke(Integer.valueOf(iIntValue6), ((List) obj2).get(iIntValue6));
            default:
                Throwable th = (Throwable) obj;
                if (th instanceof WorkerStoppedException) {
                    ((zaa) obj3).c.compareAndSet(-256, ((WorkerStoppedException) th).E);
                }
                ((saa) obj2).cancel(false);
                return ieiVar;
        }
    }
}
