package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.model.ModelSelectorEntry;
import com.anthropic.claude.types.strings.FileId;
import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.types.strings.ProjectId;
import java.util.List;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class be5 implements bz7 {
    public static final be5 F = new be5(0);
    public static final be5 G = new be5(1);
    public static final be5 H = new be5(2);
    public static final be5 I = new be5(3);
    public static final be5 J = new be5(4);
    public static final be5 K = new be5(5);
    public static final be5 L = new be5(6);
    public static final be5 M = new be5(7);
    public static final be5 N = new be5(8);
    public static final be5 O = new be5(9);
    public static final be5 P = new be5(10);
    public static final be5 Q = new be5(11);
    public static final be5 R = new be5(12);
    public static final be5 S = new be5(13);
    public static final be5 T = new be5(14);
    public static final be5 U = new be5(15);
    public static final be5 V = new be5(16);
    public static final be5 W = new be5(17);
    public static final be5 X = new be5(18);
    public static final be5 Y = new be5(19);
    public static final be5 Z = new be5(20);
    public static final be5 a0 = new be5(21);
    public static final be5 b0 = new be5(22);
    public static final be5 c0 = new be5(23);
    public static final be5 d0 = new be5(24);
    public static final be5 e0 = new be5(25);
    public static final be5 f0 = new be5(26);
    public static final be5 g0 = new be5(27);
    public static final be5 h0 = new be5(28);
    public static final be5 i0 = new be5(29);
    public final /* synthetic */ int E;

    public /* synthetic */ be5(int i) {
        this.E = i;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        List list;
        switch (this.E) {
            case 0:
                List list2 = (List) obj;
                list2.getClass();
                list = list2.size() > 1 ? list2 : null;
                return list != null ? w44.J0(1, list) : list2;
            case 1:
                List list3 = (List) obj;
                list3.getClass();
                list = list3.size() > 1 ? list3 : null;
                return list != null ? w44.J0(1, list) : list3;
            case 2:
                List list4 = (List) obj;
                list4.getClass();
                list = list4.size() > 1 ? list4 : null;
                return list != null ? w44.J0(1, list) : list4;
            case 3:
                List list5 = (List) obj;
                list5.getClass();
                list = list5.size() > 1 ? list5 : null;
                return list != null ? w44.J0(1, list) : list5;
            case 4:
                List list6 = (List) obj;
                list6.getClass();
                list = list6.size() > 1 ? list6 : null;
                return list != null ? w44.J0(1, list) : list6;
            case 5:
                List list7 = (List) obj;
                list7.getClass();
                list = list7.size() > 1 ? list7 : null;
                return list != null ? w44.J0(1, list) : list7;
            case 6:
                ((Number) obj).intValue();
                return null;
            case 7:
                ((Number) obj).intValue();
                return null;
            case 8:
                ((Number) obj).intValue();
                return null;
            case 9:
                List list8 = (List) obj;
                list8.getClass();
                list = list8.size() > 1 ? list8 : null;
                return list != null ? w44.J0(1, list) : list8;
            case 10:
                List list9 = (List) obj;
                list9.getClass();
                list = list9.size() > 1 ? list9 : null;
                return list != null ? w44.J0(1, list) : list9;
            case 11:
                List list10 = (List) obj;
                list10.getClass();
                list = list10.size() > 1 ? list10 : null;
                return list != null ? w44.J0(1, list) : list10;
            case 12:
                List list11 = (List) obj;
                list11.getClass();
                list = list11.size() > 1 ? list11 : null;
                return list != null ? w44.J0(1, list) : list11;
            case 13:
                List list12 = (List) obj;
                list12.getClass();
                list = list12.size() > 1 ? list12 : null;
                return list != null ? w44.J0(1, list) : list12;
            case 14:
                List list13 = (List) obj;
                list13.getClass();
                list = list13.size() > 1 ? list13 : null;
                return list != null ? w44.J0(1, list) : list13;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                List list14 = (List) obj;
                list14.getClass();
                list = list14.size() > 1 ? list14 : null;
                return list != null ? w44.J0(1, list) : list14;
            case 16:
                List list15 = (List) obj;
                list15.getClass();
                list = list15.size() > 1 ? list15 : null;
                return list != null ? w44.J0(1, list) : list15;
            case g.MAX_FIELD_NUMBER /* 17 */:
                List list16 = (List) obj;
                list16.getClass();
                list = list16.size() > 1 ? list16 : null;
                return list != null ? w44.J0(1, list) : list16;
            case g.AVG_FIELD_NUMBER /* 18 */:
                return Boolean.valueOf(((p68) obj) instanceof pb);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return Boolean.valueOf(((p68) obj) instanceof bc1);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return Boolean.valueOf(((p68) obj) instanceof pb);
            case 21:
                List list17 = (List) obj;
                list17.getClass();
                list = list17.size() > 1 ? list17 : null;
                return list != null ? w44.J0(1, list) : list17;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ModelSelectorEntry modelSelectorEntry = (ModelSelectorEntry) obj;
                modelSelectorEntry.getClass();
                return ModelId.m1058boximpl(modelSelectorEntry.m364getIdi4oh0I());
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ged gedVar = (ged) obj;
                gedVar.getClass();
                return FileId.m1014boximpl(gedVar.a);
            case 24:
                ((ProjectId) obj).m1085unboximpl().getClass();
                throw new IllegalStateException("Should not be available");
            case BuildConfig.VERSION_CODE /* 25 */:
                jz0 jz0Var = (jz0) obj;
                jz0Var.getClass();
                return Boolean.valueOf(jz0Var.a instanceof wz0);
            case 26:
                jz0 jz0Var2 = (jz0) obj;
                jz0Var2.getClass();
                return Boolean.valueOf(jz0Var2.a instanceof yz0);
            case 27:
                jz0 jz0Var3 = (jz0) obj;
                jz0Var3.getClass();
                return Boolean.valueOf(jz0Var3.a instanceof uz0);
            case 28:
                jz0 jz0Var4 = (jz0) obj;
                jz0Var4.getClass();
                return Boolean.valueOf(jz0Var4.a instanceof tz0);
            default:
                jz0 jz0Var5 = (jz0) obj;
                jz0Var5.getClass();
                return Boolean.valueOf(jz0Var5.a instanceof yz0);
        }
    }
}
