package defpackage;

import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.parse.MTMathList;
import com.anthropic.claude.analytics.events.McpEvents$McpToolsListed;
import com.anthropic.claude.api.chat.MessageAttachment;
import com.anthropic.claude.api.chat.MessageBlobFile;
import com.anthropic.claude.api.chat.MessageDocumentFile;
import com.anthropic.claude.api.chat.MessageImageAsset;
import com.anthropic.claude.api.chat.MessageImageFile;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.chat.bottomsheet.options.ChatOptionsBottomSheetDestination;
import com.anthropic.claude.code.remote.c;
import com.anthropic.claude.code.remote.stores.a;
import com.anthropic.claude.login.LoginScreens;
import com.anthropic.claude.login.MagicLinkIntentData;
import com.anthropic.claude.mcpapps.transport.LogParams;
import com.anthropic.claude.mcpapps.transport.SizeChangedParams;
import com.anthropic.claude.sessions.types.PermissionMode;
import com.anthropic.claude.types.strings.McpServerId;
import java.util.Iterator;
import java.util.List;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ft9 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ ft9(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [mq5, tp4] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4 */
    @Override // defpackage.zy7
    public final Object a() {
        ?? r3 = 0;
        switch (this.E) {
            case 0:
                ((dt9) this.F).a = (MTMathList) this.G;
                return iei.a;
            case 1:
                wz5 wz5Var = (wz5) this.F;
                lx9 lx9Var = (lx9) this.G;
                yw9 yw9Var = (yw9) wz5Var.getValue();
                return new zw9(lx9Var, yw9Var, new l94((b79) ((pz9) lx9Var.d.e).getValue(), yw9Var));
            case 2:
                wz5 wz5Var2 = (wz5) this.F;
                koc kocVar = (koc) this.G;
                znc zncVar = (znc) wz5Var2.getValue();
                return new aoc(kocVar, zncVar, new l94((b79) ((pz9) kocVar.d.J).getValue(), zncVar));
            case 3:
                rwe rweVar = (rwe) this.F;
                rwe rweVar2 = (rwe) this.G;
                rweVar.E.m(be5.Q, new ae5(26));
                rweVar2.E.m(new jga(8, new LoginScreens[]{LoginScreens.MinorBlocked.INSTANCE}), new ae5(27));
                return iei.a;
            case 4:
                rja rjaVar = (rja) this.F;
                zy7 zy7Var = (zy7) this.G;
                if (!((Boolean) rjaVar.d.getValue()).booleanValue()) {
                    zy7Var.a();
                }
                return iei.a;
            case 5:
                bpa bpaVar = (bpa) this.F;
                MagicLinkIntentData magicLinkIntentData = (MagicLinkIntentData) this.G;
                bpaVar.O(magicLinkIntentData.getNonce(), magicLinkIntentData.getEncodedEmail());
                return iei.a;
            case 6:
                w7 w7Var = (w7) this.F;
                rwe rweVar3 = (rwe) this.G;
                w7Var.a(v7.G);
                rweVar3.E.m(be5.W, new ppa(11));
                return iei.a;
            case 7:
                return (List) ((List) this.F).get(((mra) this.G).b.h());
            case 8:
                ((bz7) this.F).invoke(((mra) this.G).P());
                return iei.a;
            case 9:
                ((bz7) this.F).invoke((vsa) this.G);
                return iei.a;
            case 10:
                m83 m83Var = (m83) this.F;
                ctc ctcVar = (ctc) this.G;
                bz7 bz7Var = m83Var.x;
                if (bz7Var != null) {
                    bz7Var.invoke(ctcVar);
                }
                return iei.a;
            case 11:
                lya lyaVar = (lya) this.F;
                ji9 ji9Var = (ji9) this.G;
                bz7 bz7Var2 = lyaVar.b.g;
                if (bz7Var2 != null) {
                    bz7Var2.invoke(ji9Var.a);
                }
                return iei.a;
            case 12:
                lya lyaVar2 = (lya) this.F;
                SizeChangedParams sizeChangedParams = (SizeChangedParams) this.G;
                bz7 bz7Var3 = lyaVar2.b.c;
                if (bz7Var3 != null) {
                    bz7Var3.invoke(sizeChangedParams);
                }
                return iei.a;
            case 13:
                lya lyaVar3 = (lya) this.F;
                Exception exc = (Exception) this.G;
                rz7 rz7Var = lyaVar3.b.m;
                if (rz7Var != null) {
                    rz7Var.invoke(aok.i(exc), aok.h(exc), "Guest message decode failed");
                }
                return iei.a;
            case 14:
                lya lyaVar4 = (lya) this.F;
                String str = (String) this.G;
                bz7 bz7Var4 = lyaVar4.b.l;
                if (bz7Var4 != null) {
                    bz7Var4.invoke(str);
                }
                return iei.a;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                lya lyaVar5 = (lya) this.F;
                LogParams logParams = (LogParams) this.G;
                bz7 bz7Var5 = lyaVar5.b.f;
                if (bz7Var5 != null) {
                    bz7Var5.invoke(logParams);
                }
                return iei.a;
            case 16:
                y3b y3bVar = (y3b) this.F;
                String strM346getUuidowoRr7k = ((McpServer) this.G).m346getUuidowoRr7k();
                koi koiVar = y3bVar.c;
                strM346getUuidowoRr7k.getClass();
                if (!y3bVar.e) {
                    y3bVar.e = true;
                    Iterator it = koiVar.f().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (McpServerId.m1032equalsimpl0(((McpServer) next).m346getUuidowoRr7k(), strM346getUuidowoRr7k)) {
                                r3 = next;
                            }
                        }
                    }
                    McpServer mcpServer = (McpServer) r3;
                    y3bVar.d.e(new McpEvents$McpToolsListed(koiVar.e, mcpServer != null ? qok.f(mcpServer).size() : 0), McpEvents$McpToolsListed.Companion.serializer());
                }
                return iei.a;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((t4g) this.F).d(new ChatOptionsBottomSheetDestination.McpSetAllToolsPermission((String) this.G, r3));
                return iei.a;
            case g.AVG_FIELD_NUMBER /* 18 */:
                f03 f03Var = (f03) this.F;
                String str2 = (String) this.G;
                str2.getClass();
                koi koiVar2 = f03Var.k;
                McpServer mcpServer2 = (McpServer) koiVar2.b().get(McpServerId.m1029boximpl(str2));
                f03Var.c.e(new McpEvents$McpToolsListed(koiVar2.e, mcpServer2 != null ? qok.f(mcpServer2).size() : 0), McpEvents$McpToolsListed.Companion.serializer());
                return iei.a;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((bz7) this.F).invoke((z4b) this.G);
                return iei.a;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                lbb lbbVar = (lbb) this.F;
                ((nwb) this.G).setValue(Boolean.FALSE);
                if (!((Boolean) lbbVar.o.getValue()).booleanValue()) {
                    gb9.D(lbbVar.a, null, null, new kbb(lbbVar, r3, i), 3);
                }
                return iei.a;
            case 21:
                bz7 bz7Var6 = (bz7) this.F;
                MessageImageAsset messageImageAssetD = nkk.d((MessageImageFile) this.G);
                messageImageAssetD.getClass();
                bz7Var6.invoke(messageImageAssetD);
                return iei.a;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((bz7) this.F).invoke((MessageDocumentFile) this.G);
                return iei.a;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((bz7) this.F).invoke((MessageBlobFile) this.G);
                return iei.a;
            case 24:
                ((bz7) this.F).invoke((MessageAttachment) this.G);
                return iei.a;
            case BuildConfig.VERSION_CODE /* 25 */:
                pz7 pz7Var = (pz7) this.F;
                seb sebVar = (seb) this.G;
                rd4 rd4VarO = sebVar.O();
                String str3 = rd4VarO != null ? (String) rd4VarO.b.getValue() : null;
                str3.getClass();
                rd4 rd4VarO2 = sebVar.O();
                pz7Var.invoke(str3, rd4VarO2 != null ? (String) rd4VarO2.c.getValue() : null);
                return iei.a;
            case 26:
                return new fcc((((long) Float.floatToRawIntBits((((isc) this.G).h() - r0.M0(56.0f)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(((cz5) this.F).q0(ryb.f))) & 4294967295L));
            case 27:
                c cVar = (c) this.F;
                nwb nwbVar = (nwb) this.G;
                a aVar = cVar.i;
                aVar.i.setValue(Boolean.TRUE);
                vb7.B(aVar.a, "auto_default_notice_seen", true);
                nwbVar.setValue(Boolean.FALSE);
                return iei.a;
            case 28:
                gb9.D((l45) this.F, null, null, new o3c((u3c) this.G, r3, i), 3);
                return iei.a;
            default:
                return Boolean.valueOf(((u3c) this.F).c() == PermissionMode.Auto && !x44.r((s71) ((wlg) this.G).getValue(), n71.b));
        }
    }
}
