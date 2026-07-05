package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.artifacts.UserArtifact;
import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.types.strings.ArtifactId;
import com.anthropic.claude.types.strings.ModelId;
import java.util.ArrayList;
import java.util.List;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class kp implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ kp(Object obj, int i, Object obj2) {
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
                return ((q6) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 1:
                ((q6) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
                return "task";
            case 2:
                return ((q6) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 3:
                return ((q6) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 4:
                ((q6) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
                return "artifact";
            case 5:
                return ((q6) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 6:
                ((q6) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
                return le6.E;
            case 7:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((pz7) obj3).invoke((Project) obj2, bool);
                return ieiVar;
            case 8:
                return ((q6) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 9:
                ((zv) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
                return ind.F;
            case 10:
                return ((zv) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 11:
                ((zv) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
                return ik7.F;
            case 12:
                return ((f7) obj3).invoke(((ArrayList) obj2).get(((Number) obj).intValue()));
            case 13:
                ((zv) obj3).invoke(((ArrayList) obj2).get(((Number) obj).intValue()));
                return br0.F;
            case 14:
                String strM963unboximpl = ((ArtifactId) obj).m963unboximpl();
                strM963unboximpl.getClass();
                bz7 bz7Var = (bz7) obj3;
                for (Object obj4 : (List) ((gr0) obj2).g.getValue()) {
                    if (ArtifactId.m960equalsimpl0(((UserArtifact) obj4).m154getUuidQssJVS4(), strM963unboximpl)) {
                        bz7Var.invoke(obj4);
                        return ieiVar;
                    }
                }
                pmf.h("Collection contains no element matching the predicate.");
                return null;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                String strM1064unboximpl = ((ModelId) obj).m1064unboximpl();
                strM1064unboximpl.getClass();
                ((mj1) obj3).V(strM1064unboximpl);
                ((t4g) obj2).c();
                return ieiVar;
            case 16:
                return ((zv) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case g.MAX_FIELD_NUMBER /* 17 */:
                return ((c32) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case g.AVG_FIELD_NUMBER /* 18 */:
                return ((c32) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((c32) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
                return "item";
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return ((c32) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 21:
                ((c32) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
                return "item";
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                int iIntValue = ((Number) obj).intValue();
                return ((te) obj3).invoke(Integer.valueOf(iIntValue), ((List) obj2).get(iIntValue));
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ((it2) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 24:
                String strM1064unboximpl2 = ((ModelId) obj).m1064unboximpl();
                strM1064unboximpl2.getClass();
                ((bz7) obj3).invoke(ModelId.m1058boximpl(strM1064unboximpl2));
                ((t4g) obj2).a();
                return ieiVar;
            case BuildConfig.VERSION_CODE /* 25 */:
                return ((it2) obj3).invoke(((ArrayList) obj2).get(((Number) obj).intValue()));
            case 26:
                return ((it2) obj3).invoke(((ArrayList) obj2).get(((Number) obj).intValue()));
            case 27:
                return ((it2) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 28:
                return ((it2) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            default:
                return ((it2) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
        }
    }
}
