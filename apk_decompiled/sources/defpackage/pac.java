package defpackage;

import android.health.connect.datatypes.AggregationType;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.MessageFileEvents$PdfPreviewResult;
import com.anthropic.claude.project.knowledge.ProjectKnowledgePreviewDestination;
import com.anthropic.claude.project.knowledge.k;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pac extends m08 implements bz7 {
    public final /* synthetic */ int E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pac(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.E = i3;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        k kVar;
        int i = this.E;
        tp4 tp4Var = null;
        int i2 = 0;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                double dDoubleValue = ((Number) obj).doubleValue();
                ((xua) this.receiver).getClass();
                return xua.a(dDoubleValue);
            case 1:
                double dDoubleValue2 = ((Number) obj).doubleValue();
                ((xua) this.receiver).getClass();
                return xua.a(dDoubleValue2);
            case 2:
                double dDoubleValue3 = ((Number) obj).doubleValue();
                ((xua) this.receiver).getClass();
                return xua.a(dDoubleValue3);
            case 3:
                double dDoubleValue4 = ((Number) obj).doubleValue();
                ((xua) this.receiver).getClass();
                return xua.a(dDoubleValue4);
            case 4:
                double dDoubleValue5 = ((Number) obj).doubleValue();
                ((xua) this.receiver).getClass();
                return xua.a(dDoubleValue5);
            case 5:
                double dDoubleValue6 = ((Number) obj).doubleValue();
                ((xua) this.receiver).getClass();
                return xua.a(dDoubleValue6);
            case 6:
                double dDoubleValue7 = ((Number) obj).doubleValue();
                ((xua) this.receiver).getClass();
                return xua.a(dDoubleValue7);
            case 7:
                double dDoubleValue8 = ((Number) obj).doubleValue();
                ((xua) this.receiver).getClass();
                return xua.a(dDoubleValue8);
            case 8:
                double dDoubleValue9 = ((Number) obj).doubleValue();
                ((xua) this.receiver).getClass();
                return xua.a(dDoubleValue9);
            case 9:
                return ((drd) this.receiver).a.get(obj);
            case 10:
                return Boolean.valueOf(((gbd) this.receiver).test(obj));
            case 11:
                ((n8i) this.receiver).getClass();
                return Boolean.TRUE;
            case 12:
                String str = (String) obj;
                str.getClass();
                fti ftiVar = (fti) this.receiver;
                ftiVar.getClass();
                ftiVar.k.setValue(bsg.k1(str).toString());
                return ieiVar;
            case 13:
                cjh cjhVar = (cjh) obj;
                cjhVar.getClass();
                ((rp6) this.receiver).W(cjhVar);
                return ieiVar;
            case 14:
                double dDoubleValue10 = ((Number) obj).doubleValue();
                ((fad) this.receiver).getClass();
                return fad.a(dDoubleValue10);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                double dDoubleValue11 = ((Number) obj).doubleValue();
                ((fad) this.receiver).getClass();
                return fad.a(dDoubleValue11);
            case 16:
                double dDoubleValue12 = ((Number) obj).doubleValue();
                ((fad) this.receiver).getClass();
                return fad.a(dDoubleValue12);
            case g.MAX_FIELD_NUMBER /* 17 */:
                int iIntValue = ((Number) obj).intValue();
                uvc uvcVar = (uvc) this.receiver;
                uvcVar.e = Integer.valueOf(iIntValue);
                uvcVar.a(MessageFileEvents$PdfPreviewResult.LOADED);
                return ieiVar;
            case g.AVG_FIELD_NUMBER /* 18 */:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ild ildVar = (ild) this.receiver;
                gb9.D(ildVar.a, null, null, new hld(ildVar, zBooleanValue, tp4Var, i2), 3);
                return ieiVar;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                fnd fndVar = (fnd) obj;
                fndVar.getClass();
                rwe rweVar = (rwe) this.receiver;
                rweVar.getClass();
                if (fndVar instanceof end) {
                    kVar = k.E;
                } else {
                    if (!(fndVar instanceof dnd)) {
                        wg6.i();
                        return null;
                    }
                    kVar = k.F;
                }
                rweVar.E.m(new jga(16, new ProjectKnowledgePreviewDestination[]{ProjectKnowledgePreviewDestination.Dismissed.INSTANCE, new ProjectKnowledgePreviewDestination.Preview(fndVar.getId(), kVar)}), new ppa(18));
                return ieiVar;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                String str2 = (String) obj;
                str2.getClass();
                ((eli) this.receiver).a(str2);
                return ieiVar;
            case 21:
                String str3 = (String) obj;
                str3.getClass();
                ((eli) this.receiver).a(str3);
                return ieiVar;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                cjh cjhVar2 = (cjh) obj;
                cjhVar2.getClass();
                nfe nfeVar = (nfe) this.receiver;
                nfeVar.getClass();
                nfeVar.e.setValue(cjhVar2);
                return ieiVar;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                cjh cjhVar3 = (cjh) obj;
                cjhVar3.getClass();
                qfe qfeVar = (qfe) this.receiver;
                qfeVar.getClass();
                qfeVar.f.setValue(cjhVar3);
                return ieiVar;
            case 24:
                AggregationType aggregationTypeN = bje.n(obj);
                aggregationTypeN.getClass();
                return tqe.m(this.receiver).get(aggregationTypeN);
            case BuildConfig.VERSION_CODE /* 25 */:
                AggregationType aggregationTypeN2 = bje.n(obj);
                aggregationTypeN2.getClass();
                return tqe.m(this.receiver).getDataOrigins(aggregationTypeN2);
            case 26:
                AggregationType aggregationTypeN3 = bje.n(obj);
                aggregationTypeN3.getClass();
                return df8.i(this.receiver).get(aggregationTypeN3);
            case 27:
                AggregationType aggregationTypeN4 = bje.n(obj);
                aggregationTypeN4.getClass();
                return df8.j(this.receiver).get(aggregationTypeN4);
            case 28:
                AggregationType aggregationTypeN5 = bje.n(obj);
                aggregationTypeN5.getClass();
                return df8.i(this.receiver).getDataOrigins(aggregationTypeN5);
            default:
                AggregationType aggregationTypeN6 = bje.n(obj);
                aggregationTypeN6.getClass();
                return df8.j(this.receiver).getDataOrigins(aggregationTypeN6);
        }
    }
}
