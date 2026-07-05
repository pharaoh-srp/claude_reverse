package defpackage;

import android.util.Log;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.api.model.ModelSelectorEntry;
import com.anthropic.claude.api.notice.Notice;
import com.anthropic.claude.mcpapps.transport.McpUiContentBlock;
import com.anthropic.claude.mcpapps.transport.SizeChangedParams;
import com.anthropic.claude.types.strings._ServerLocalizedString;
import com.google.android.gms.maps.model.LatLng;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Map;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jua implements bz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ jua(int i) {
        this.E = i;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        uk6 uk6Var;
        uk6 uk6Var2;
        int i = this.E;
        q68 q68Var = null;
        boolean z = true;
        z = true;
        z = true;
        boolean z2 = true;
        z = true;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((fua) obj).getClass();
                return ieiVar;
            case 1:
                ((fua) obj).getClass();
                return Boolean.FALSE;
            case 2:
                ((fua) obj).getClass();
                return ieiVar;
            case 3:
                ((fua) obj).getClass();
                return ieiVar;
            case 4:
                ((fua) obj).getClass();
                return ieiVar;
            case 5:
                LatLng latLng = (LatLng) obj;
                latLng.getClass();
                return new pua(latLng);
            case 6:
                return ieiVar;
            case 7:
                mr1 mr1Var = (mr1) obj;
                mr1Var.getClass();
                mr1Var.s1(8.0f);
                mr1Var.r1((((long) Float.floatToRawIntBits(MTTypesetterKt.kLineSkipLimitMultiplier)) << 32) | (((long) Float.floatToRawIntBits(2.0f)) & 4294967295L));
                mr1Var.q1(d54.b(0.08f, d54.b));
                return ieiVar;
            case 8:
                McpUiContentBlock.Text text = (McpUiContentBlock.Text) obj;
                text.getClass();
                return text.getText();
            case 9:
                ((SizeChangedParams) obj).getClass();
                return ieiVar;
            case 10:
                y2b y2bVar = (y2b) obj;
                y2bVar.getClass();
                return y2bVar.a;
            case 11:
                McpServer mcpServer = (McpServer) obj;
                mcpServer.getClass();
                return mcpServer.m346getUuidowoRr7k();
            case 12:
                ((Integer) obj).getClass();
                return fqb.E;
            case 13:
                String str = (String) obj;
                str.getClass();
                if (str.length() <= 0) {
                    return str;
                }
                return Character.toUpperCase(str.charAt(0)) + str.substring(1);
            case 14:
                ckf.s((ekf) obj, 0);
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                g25 g25Var = (g25) obj;
                g25Var.getClass();
                return ij0.C(g25Var.a, "=", g25Var.b);
            case 16:
                ((Duration) obj).getClass();
                return new cpc(Double.valueOf(r12.toMinutes()), "minutes");
            case g.MAX_FIELD_NUMBER /* 17 */:
                ckf.y((ekf) obj);
                return ieiVar;
            case g.AVG_FIELD_NUMBER /* 18 */:
                wn9[] wn9VarArr = ckf.a;
                ((ekf) obj).a(akf.y, ieiVar);
                return ieiVar;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ModelSelectorEntry._get_notice_$lambda$0((_ServerLocalizedString) obj);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return ModelSelectorEntry._get_noticeFingerprint_$lambda$0((_ServerLocalizedString) obj);
            case 21:
                ((Map) obj).getClass();
                return ieiVar;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object value = entry.getValue();
                return kgh.q(new StringBuilder("  "), ((xbd) entry.getKey()).a, " = ", value instanceof byte[] ? mp0.L0((byte[]) value, ", ", null, 56) : String.valueOf(entry.getValue()));
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                float f = ryb.a;
                return ieiVar;
            case 24:
                Throwable th = (Throwable) obj;
                th.getClass();
                return th.getCause();
            case BuildConfig.VERSION_CODE /* 25 */:
                ((String) obj).getClass();
                return ieiVar;
            case 26:
                qk6 qk6Var = (qk6) obj;
                if ((qk6Var instanceof wk6) || !qk6Var.b().b(new jua(27))) {
                    return qk6Var;
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                q68 q68VarB = qk6Var.b();
                boolean zB = q68VarB.b(be5.Y);
                o68 o68Var = o68.a;
                cpc cpcVar = zB ? (cpc) q68VarB.a(bw9.Z, new cpc(null, o68Var)) : new cpc(null, q68VarB);
                bc1 bc1Var = (bc1) cpcVar.E;
                q68 q68Var2 = (q68) cpcVar.F;
                p46 p46Var = p46.a;
                if (bc1Var == null) {
                    uk6Var = null;
                } else {
                    if (!(bc1Var instanceof bc1)) {
                        wg6.i();
                        return null;
                    }
                    uk6Var = new uk6();
                    uk6Var.a = ovj.d(o68Var).d(new km8(p46Var));
                    uk6Var.b = bc1Var.a;
                    uk6Var.e = 2;
                    uk6Var.c = bc1Var.b.a;
                    uk6Var.d = null;
                }
                if (((Number) q68Var2.a(new oua(5), 0)).intValue() > 1) {
                    Log.w("GlanceAppWidget", "More than one clickable defined on the same GlanceModifier, only the last one will be used.");
                }
                cpc cpcVar2 = q68Var2.b(be5.Z) ? (cpc) q68Var2.a(bw9.a0, new cpc(null, o68Var)) : new cpc(null, q68Var2);
                pb pbVar = (pb) cpcVar2.E;
                q68 q68Var3 = (q68) cpcVar2.F;
                arrayList.add(pbVar);
                if (pbVar != null) {
                    int i2 = pbVar.b;
                    j50 j50Var = i2 != 0 ? new j50(i2) : new j50(R.drawable.glance_ripple);
                    uk6Var2 = new uk6();
                    uk6Var2.a = ovj.d(o68Var).d(new km8(p46Var));
                    uk6Var2.b = j50Var;
                } else {
                    uk6Var2 = null;
                }
                vd7 vd7Var = q68Var3.b(new jua(28)) ? (vd7) q68Var3.a(new oua(6), new vd7(q68Var, 3)) : new vd7(q68Var3, true ? 1 : 0);
                q68 q68Var4 = vd7Var.a;
                q68 q68Var5 = vd7Var.b;
                arrayList.add(q68Var4);
                arrayList2.add(ovj.d(q68Var5).d(new km8(p46Var)));
                rk6 rk6Var = new rk6();
                rk6Var.c = nuk.g(arrayList);
                qk6Var.c(nuk.g(arrayList2));
                ArrayList arrayList3 = rk6Var.b;
                if (uk6Var != null) {
                    arrayList3.add(uk6Var);
                }
                arrayList3.add(qk6Var);
                if (uk6Var2 == null) {
                    return rk6Var;
                }
                arrayList3.add(uk6Var2);
                return rk6Var;
            case 27:
                p68 p68Var = (p68) obj;
                if (!(p68Var instanceof bc1) && !(p68Var instanceof pb)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 28:
                p68 p68Var2 = (p68) obj;
                if (!(p68Var2 instanceof gaj) && !(p68Var2 instanceof km8) && !(p68Var2 instanceof q35)) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            default:
                return Notice._get_fingerprint_$lambda$0((String) obj);
        }
    }
}
