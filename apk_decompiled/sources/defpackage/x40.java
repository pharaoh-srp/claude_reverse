package defpackage;

import androidx.health.platform.client.proto.g;
import coil3.compose.AsyncImagePainter$State$Error;
import com.anthropic.claude.api.mcp.McpServer;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class x40 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ nwb F;

    public /* synthetic */ x40(int i, nwb nwbVar) {
        this.E = i;
        this.F = nwbVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        nwb nwbVar = this.F;
        switch (i) {
            case 0:
                cu9 cu9Var = (cu9) obj;
                cu9Var.getClass();
                nwbVar.setValue(new g79(cu9Var.k()));
                break;
            case 1:
                cu9 cu9Var2 = (cu9) obj;
                cu9Var2.getClass();
                nwbVar.setValue(new g79(cu9Var2.k()));
                break;
            case 2:
                nwbVar.setValue((cu9) obj);
                break;
            case 3:
                String str = (String) obj;
                str.getClass();
                nwbVar.setValue(str);
                break;
            case 4:
                String str2 = (String) obj;
                str2.getClass();
                nwbVar.setValue(str2);
                break;
            case 5:
                String str3 = (String) obj;
                str3.getClass();
                nwbVar.setValue(str3);
                break;
            case 6:
                xre xreVar = (xre) obj;
                xreVar.getClass();
                xreVar.b(!bsg.I0((String) nwbVar.getValue()) ? 1.0f : 0.4f);
                break;
            case 7:
                nwbVar.setValue((cu9) obj);
                break;
            case 8:
                if (!((Boolean) obj).booleanValue()) {
                    nwbVar.setValue(Boolean.TRUE);
                }
                break;
            case 9:
                nwbVar.setValue(new va6(((va6) obj).E));
                break;
            case 10:
                String str4 = (String) obj;
                str4.getClass();
                nwbVar.setValue(str4);
                break;
            case 11:
                String str5 = (String) obj;
                str5.getClass();
                nwbVar.setValue(str5);
                break;
            case 12:
                cu9 cu9Var3 = (cu9) obj;
                cu9Var3.getClass();
                cu9 cu9VarA = cu9Var3.A();
                nwbVar.setValue(new y69(yfd.a0(cu9VarA != null ? cu9VarA.G(cu9Var3, 0L) : 0L)));
                break;
            case 13:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                nwbVar.setValue(bool);
                break;
            case 14:
                yjh yjhVar = (yjh) obj;
                yjhVar.getClass();
                if (yjhVar.d()) {
                    nwbVar.setValue(Boolean.TRUE);
                }
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                nwbVar.setValue((g79) obj);
                break;
            case 16:
                ((AsyncImagePainter$State$Error) obj).getClass();
                nwbVar.setValue(Boolean.TRUE);
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                String str6 = (String) obj;
                str6.getClass();
                nwbVar.setValue(str6);
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ((AsyncImagePainter$State$Error) obj).getClass();
                nwbVar.setValue(Boolean.TRUE);
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((AsyncImagePainter$State$Error) obj).getClass();
                nwbVar.setValue(Boolean.TRUE);
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                vg4 vg4Var = (vg4) obj;
                vg4Var.getClass();
                nwbVar.setValue(vg4Var);
                break;
            case 21:
                McpServer mcpServer = (McpServer) obj;
                mcpServer.getClass();
                nwbVar.setValue(mcpServer.m346getUuidowoRr7k());
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                McpServer mcpServer2 = (McpServer) obj;
                mcpServer2.getClass();
                nwbVar.setValue(mcpServer2.m346getUuidowoRr7k());
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ir4 ir4Var = (ir4) obj;
                ir4Var.getClass();
                nwbVar.setValue(ir4Var);
                break;
            case 24:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                nwbVar.setValue(bool2);
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                ((b5g) obj).getClass();
                break;
            case 26:
                Boolean bool3 = (Boolean) obj;
                bool3.getClass();
                nwbVar.setValue(bool3);
                break;
            case 27:
                String str7 = (String) obj;
                str7.getClass();
                nwbVar.setValue(str7);
                break;
            case 28:
                String str8 = (String) obj;
                str8.getClass();
                StringBuilder sb = new StringBuilder();
                int length = str8.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char cCharAt = str8.charAt(i2);
                    if (cCharAt == '+' || Character.isDigit(cCharAt)) {
                        sb.append(cCharAt);
                    }
                }
                nwbVar.setValue(sb.toString());
                break;
            default:
                McpServer mcpServer3 = (McpServer) obj;
                mcpServer3.getClass();
                nwbVar.setValue(mcpServer3.m346getUuidowoRr7k());
                break;
        }
        return ieiVar;
    }
}
