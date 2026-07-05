package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.ChatMessageActionEvents$ActionSource;
import com.anthropic.claude.api.chat.messages.ToolResultBlock;
import com.anthropic.claude.api.chat.messages.ToolUseBlock;
import com.anthropic.claude.types.strings.MessageId;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class bw9 implements pz7 {
    public static final bw9 F = new bw9(0);
    public static final bw9 G = new bw9(1);
    public static final bw9 H = new bw9(2);
    public static final bw9 I = new bw9(3);
    public static final bw9 J = new bw9(4);
    public static final bw9 K = new bw9(5);
    public static final bw9 L = new bw9(6);
    public static final bw9 M = new bw9(7);
    public static final bw9 N = new bw9(8);
    public static final bw9 O = new bw9(9);
    public static final bw9 P = new bw9(10);
    public static final bw9 Q = new bw9(11);
    public static final bw9 R = new bw9(12);
    public static final bw9 S = new bw9(13);
    public static final bw9 T = new bw9(14);
    public static final bw9 U = new bw9(15);
    public static final bw9 V = new bw9(16);
    public static final bw9 W = new bw9(17);
    public static final bw9 X = new bw9(18);
    public static final bw9 Y = new bw9(19);
    public static final bw9 Z = new bw9(20);
    public static final bw9 a0 = new bw9(21);
    public static final bw9 b0 = new bw9(22);
    public static final bw9 c0 = new bw9(23);
    public static final bw9 d0 = new bw9(24);
    public static final bw9 e0 = new bw9(25);
    public static final bw9 f0 = new bw9(26);
    public static final bw9 g0 = new bw9(27);
    public static final bw9 h0 = new bw9(28);
    public static final bw9 i0 = new bw9(29);
    public final /* synthetic */ int E;

    public /* synthetic */ bw9(int i) {
        this.E = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                p68 p68Var = (p68) obj2;
                if (p68Var instanceof gaj) {
                }
                break;
            case 1:
                p68 p68Var2 = (p68) obj2;
                if (p68Var2 instanceof km8) {
                }
                break;
            case 2:
                p68 p68Var3 = (p68) obj2;
                if (p68Var3 instanceof gaj) {
                }
                break;
            case 3:
                p68 p68Var4 = (p68) obj2;
                if (p68Var4 instanceof km8) {
                }
                break;
            case 4:
                p68 p68Var5 = (p68) obj2;
                if (p68Var5 instanceof gaj) {
                }
                break;
            case 5:
                p68 p68Var6 = (p68) obj2;
                if (p68Var6 instanceof km8) {
                }
                break;
            case 6:
                p68 p68Var7 = (p68) obj2;
                if (p68Var7 instanceof bu) {
                }
                break;
            case 7:
                p68 p68Var8 = (p68) obj2;
                if (p68Var8 instanceof gaj) {
                }
                break;
            case 8:
                p68 p68Var9 = (p68) obj2;
                if (p68Var9 instanceof km8) {
                }
                break;
            case 9:
                bta btaVar = (bta) obj;
                cz5 cz5Var = (cz5) obj2;
                btaVar.getClass();
                cz5Var.getClass();
                btaVar.b = cz5Var;
                break;
            case 10:
                bta btaVar2 = (bta) obj;
                ka2 ka2Var = (ka2) obj2;
                btaVar2.getClass();
                ka2Var.getClass();
                ka2 ka2Var2 = btaVar2.d;
                if (ka2Var != ka2Var2) {
                    ka2Var2.b(null);
                    btaVar2.d = ka2Var;
                    ka2Var.b(btaVar2.a);
                }
                break;
            case 11:
                bta btaVar3 = (bta) obj;
                fu9 fu9Var = (fu9) obj2;
                btaVar3.getClass();
                fu9Var.getClass();
                btaVar3.c = fu9Var;
                break;
            case 12:
                bta btaVar4 = (bta) obj;
                btaVar4.getClass();
                btaVar4.a.d((String) obj2);
                break;
            case 13:
                ToolUseBlock toolUseBlock = (ToolUseBlock) obj;
                MessageId messageId = (MessageId) obj2;
                if (messageId != null) {
                    messageId.m1057unboximpl();
                }
                toolUseBlock.getClass();
                break;
            case 14:
                ToolResultBlock toolResultBlock = (ToolResultBlock) obj;
                MessageId messageId2 = (MessageId) obj2;
                if (messageId2 != null) {
                    messageId2.m1057unboximpl();
                }
                toolResultBlock.getClass();
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                cpc cpcVar = (cpc) obj;
                p68 p68Var10 = (p68) obj2;
                if (!(p68Var10 instanceof pb)) {
                }
                break;
            case 16:
                p68 p68Var11 = (p68) obj2;
                if (p68Var11 instanceof km8) {
                }
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                p68 p68Var12 = (p68) obj2;
                if (p68Var12 instanceof gaj) {
                }
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                p68 p68Var13 = (p68) obj2;
                if (p68Var13 instanceof km8) {
                }
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                p68 p68Var14 = (p68) obj2;
                if (p68Var14 instanceof gaj) {
                }
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                cpc cpcVar2 = (cpc) obj;
                p68 p68Var15 = (p68) obj2;
                if (!(p68Var15 instanceof bc1)) {
                }
                break;
            case 21:
                cpc cpcVar3 = (cpc) obj;
                p68 p68Var16 = (p68) obj2;
                if (!(p68Var16 instanceof pb)) {
                }
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                break;
            case 24:
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                break;
            case 26:
                ((Number) obj2).intValue();
                e18 e18Var = (e18) ((ld4) obj);
                e18Var.a0(626488777);
                long j = ((d54) e18Var.j(on4.a)).a;
                e18Var.p(false);
                break;
            case 27:
                ((Number) obj2).intValue();
                e18 e18Var2 = (e18) ((ld4) obj);
                e18Var2.a0(1457540156);
                long j2 = ((d54) e18Var2.j(bte.b)).a;
                e18Var2.p(false);
                break;
            case 28:
                String strM1057unboximpl = ((MessageId) obj2).m1057unboximpl();
                ((ChatMessageActionEvents$ActionSource) obj).getClass();
                strM1057unboximpl.getClass();
                break;
            default:
                String strM1057unboximpl2 = ((MessageId) obj2).m1057unboximpl();
                ((ChatMessageActionEvents$ActionSource) obj).getClass();
                strM1057unboximpl2.getClass();
                break;
        }
        return ieiVar;
    }
}
