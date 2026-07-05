package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.account.Organization;
import com.anthropic.claude.api.chat.ModelSelection;
import com.anthropic.claude.api.memory.MemorySynthesisResponse;
import com.anthropic.claude.api.notification.ChannelPreference;
import com.anthropic.claude.api.notification.TestPushCategory;
import java.io.IOException;
import java.util.List;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class aac implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ aac(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v17, types: [pz7] */
    /* JADX WARN: Type inference failed for: r5v0, types: [tp4] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // defpackage.zy7
    public final Object a() throws IOException {
        int i = this.E;
        int i2 = 2;
        iei ieiVar = iei.a;
        Object obj = this.G;
        Object obj2 = this.F;
        switch (i) {
            case 0:
                break;
            case 1:
                ((zy7) obj2).a();
                w7 w7Var = ((jkc) obj).e;
                w7Var.getClass();
                List list = xah.a;
                xah.e(6, "Requesting add-account flow", null, null);
                w7Var.a.r(r7.a);
                break;
            case 2:
                ((bz7) obj2).invoke((Organization) obj);
                break;
            case 3:
                break;
            case 4:
                ((bz7) obj2).invoke((dwg) obj);
                break;
            case 5:
                ((bz7) obj2).invoke((gwg) obj);
                break;
            case 6:
                vid vidVar = (vid) obj;
                ((ps7) obj2).b(false);
                gb9.D(vidVar.a, null, null, new tid(vidVar, , i2), 3);
                break;
            case 7:
                ?? r14 = (pz7) obj2;
                lsc lscVar = ((ild) obj).q;
                MemorySynthesisResponse memorySynthesisResponse = (MemorySynthesisResponse) lscVar.getValue();
                String memory = memorySynthesisResponse != null ? memorySynthesisResponse.getMemory() : null;
                MemorySynthesisResponse memorySynthesisResponse2 = (MemorySynthesisResponse) lscVar.getValue();
                r14.invoke(memory, memorySynthesisResponse2 != null ? memorySynthesisResponse2.getUpdated_at() : 0);
                break;
            case 8:
                pmd pmdVar = (pmd) obj2;
                String str = (String) pmdVar.g.getValue();
                pmdVar.g.setValue("");
                lsc lscVar2 = pmdVar.h;
                String str2 = (String) lscVar2.getValue();
                lscVar2.setValue("");
                gb9.D(pmdVar.a, null, null, new ba9(pmdVar, str, str2, null, 10), 3);
                ((t4g) obj).a();
                break;
            case 9:
                ((ti7) obj2).a();
                ((t4g) obj).a();
                break;
            case 10:
                l4h l4hVar = (l4h) obj2;
                t4g t4gVar = (t4g) obj;
                if (l4hVar != null) {
                    l4hVar.a();
                }
                t4gVar.a();
                break;
            case 11:
                ((q2d) obj2).a();
                ((t4g) obj).a();
                break;
            case 12:
                lod lodVar = (lod) obj2;
                zy7 zy7Var = (zy7) obj;
                int iOrdinal = lodVar.O().ordinal();
                if (iOrdinal == 0) {
                    zy7Var.a();
                } else if (iOrdinal != 1) {
                    wg6.i();
                } else {
                    lodVar.o.setValue(tji.E);
                }
                break;
            case 13:
                ChannelPreference channelPreference = (ChannelPreference) obj2;
                bz7 bz7Var = (bz7) obj;
                Boolean enable_push = channelPreference != null ? channelPreference.getEnable_push() : null;
                if (!x44.r(enable_push, Boolean.TRUE)) {
                    if (x44.r(enable_push, Boolean.FALSE) || enable_push == null) {
                        z = true;
                    } else {
                        wg6.i();
                    }
                }
                bz7Var.invoke(Boolean.valueOf(z));
                break;
            case 14:
                ((bz7) obj2).invoke((TestPushCategory) obj);
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                Object systemService = ((Context) obj2).getSystemService("clipboard");
                systemService.getClass();
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("FCM Token", (String) ((kzd) obj).j.getValue()));
                break;
            case 16:
                q7e q7eVar = (q7e) obj2;
                nwb nwbVar = (nwb) obj;
                v5b v5bVarO = q7eVar.O();
                v5b v5bVar = v5b.E;
                if (v5bVarO == v5bVar) {
                    v5bVar = v5b.F;
                }
                q7eVar.c.setValue(v5bVar);
                nwbVar.setValue(Boolean.FALSE);
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ((bz7) obj2).invoke((ModelSelection) obj);
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                xee xeeVar = (xee) obj2;
                String str3 = (String) obj;
                xeeVar.getClass();
                str3.getClass();
                break;
            case 21:
                zy7 zy7Var2 = (zy7) obj;
                if (!((Boolean) ((nfe) obj2).f.getValue()).booleanValue()) {
                    zy7Var2.a();
                }
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                zy7 zy7Var3 = (zy7) obj;
                if (!((Boolean) ((qfe) obj2).g.getValue()).booleanValue()) {
                    zy7Var3.a();
                }
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((gf8) obj2).a(0);
                ((nwb) obj).setValue(Boolean.TRUE);
                break;
            case 24:
                ((e5h) obj2).b.invoke((String) obj);
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                kwe kweVar = (kwe) obj;
                ((nwb) obj2).setValue(kweVar != null ? kweVar.a : null);
                break;
            case 26:
                break;
            case 27:
                mif mifVar = (mif) obj2;
                long j = ((g79) ((nwb) obj).getValue()).a;
                ohf ohfVarJ = mifVar.j();
                long jY = 9205357640488583168L;
                if (ohfVarJ != null) {
                    te8 te8VarI = mifVar.i();
                    int i3 = te8VarI == null ? -1 : oif.a[te8VarI.ordinal()];
                    if (i3 != -1) {
                        if (i3 == 1) {
                            jY = u00.y(mifVar, j, ohfVarJ.a);
                        } else if (i3 == 2) {
                            jY = u00.y(mifVar, j, ohfVarJ.b);
                        } else if (i3 == 3) {
                            sz6.j("SelectionContainer does not support cursor");
                        } else {
                            wg6.i();
                        }
                    }
                }
                break;
            case 28:
                ((zy1) obj2).r(Long.valueOf(((jrf) obj).h.b()));
                break;
            default:
                ((gh2) obj2).r(Long.valueOf(((jrf) obj).h.b()));
                break;
        }
        return ieiVar;
    }
}
