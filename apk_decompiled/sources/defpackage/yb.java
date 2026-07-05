package defpackage;

import android.net.Uri;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.bell.api.VoiceSelection;
import com.anthropic.claude.types.strings.SessionId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yb extends m08 implements bz7 {
    public final /* synthetic */ int E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yb(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.E = i3;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        tp4 tp4Var = null;
        int i2 = 3;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                double dDoubleValue = ((Number) obj).doubleValue();
                ((sn6) this.receiver).getClass();
                break;
            case 1:
                yk ykVar = (yk) obj;
                ykVar.getClass();
                vm.a((vm) this.receiver, ykVar);
                break;
            case 2:
                fk fkVar = (fk) obj;
                fkVar.getClass();
                an anVar = (an) this.receiver;
                anVar.getClass();
                vm vmVar = (vm) anVar.b;
                vmVar.getClass();
                kk kkVar = vmVar.V;
                kkVar.getClass();
                String strC = fkVar.c();
                if (strC != null) {
                }
                break;
            case 3:
                fk fkVar2 = (fk) obj;
                fkVar2.getClass();
                ((an) this.receiver).Q(fkVar2);
                break;
            case 4:
                fk fkVar3 = (fk) obj;
                fkVar3.getClass();
                ((an) this.receiver).Q(fkVar3);
                break;
            case 5:
                String strM1120unboximpl = ((SessionId) obj).m1120unboximpl();
                strM1120unboximpl.getClass();
                an anVar2 = (an) this.receiver;
                anVar2.getClass();
                gb9.D(anVar2.a, null, null, new zm(anVar2, strM1120unboximpl, tp4Var, i2), 3);
                break;
            case 6:
                UUID uuid = (UUID) obj;
                uuid.getClass();
                an anVar3 = (an) this.receiver;
                anVar3.getClass();
                vm vmVar2 = (vm) anVar3.b;
                vmVar2.getClass();
                b54.w0(new xl(uuid, 0), vmVar2.T);
                lf9 lf9Var = (lf9) vmVar2.U.remove(uuid);
                if (lf9Var != null) {
                    lf9Var.d(null);
                }
                break;
            case 7:
                List<Uri> list = (List) obj;
                list.getClass();
                an anVar4 = (an) this.receiver;
                anVar4.getClass();
                for (Uri uri : list) {
                    vm vmVar3 = (vm) anVar4.b;
                    vmVar3.getClass();
                    rc8 rc8Var = vmVar3.i;
                    uri.getClass();
                    kdg kdgVar = vmVar3.T;
                    if (kdgVar.size() >= amk.c(rc8Var).getMax_per_message_upload_count()) {
                        zfa.a.getClass();
                        if (yfa.b()) {
                            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : copyOnWriteArrayList) {
                                ((n30) ((zfa) obj2)).getClass();
                                arrayList.add(obj2);
                            }
                            if (!arrayList.isEmpty()) {
                                zfa.a.getClass();
                                String str = "addUpload: at maxAttachments=" + amk.c(rc8Var).getMax_per_message_upload_count() + ", dropping " + uri;
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    ((n30) ((zfa) it.next())).b(sfa.DEBUG, "AgentChat", str);
                                }
                            }
                        }
                    } else {
                        UUID uuidRandomUUID = UUID.randomUUID();
                        uuidRandomUUID.getClass();
                        String lastPathSegment = uri.getLastPathSegment();
                        if (lastPathSegment == null) {
                            lastPathSegment = "file";
                        }
                        ol olVar = new ol(uuidRandomUUID, uri, lastPathSegment, false);
                        kdgVar.add(olVar);
                        vmVar3.U.put(uuidRandomUUID, gb9.D(vmVar3.k, null, null, new cm(vmVar3, uri, olVar, uuidRandomUUID, null, 0), 3));
                    }
                }
                break;
            case 8:
                fk fkVar4 = (fk) obj;
                fkVar4.getClass();
                an anVar5 = (an) this.receiver;
                anVar5.getClass();
                vm vmVar4 = (vm) anVar5.b;
                vmVar4.getClass();
                vmVar4.V.a(fkVar4);
                break;
            case 9:
                y5e y5eVar = (y5e) obj;
                y5eVar.getClass();
                ((j8i) this.receiver).h(y5eVar);
                break;
            case 10:
                x76 x76Var = (x76) obj;
                x76Var.getClass();
                ep epVar = (ep) this.receiver;
                epVar.getClass();
                epVar.j.setValue(epVar.Q().contains(x76Var) ? dxf.n0(epVar.Q(), x76Var) : dxf.q0(epVar.Q(), x76Var));
                break;
            case 11:
                Project project = (Project) obj;
                project.getClass();
                uv uvVar = (uv) this.receiver;
                uvVar.getClass();
                gb9.D(uvVar.a, null, null, new m0(uvVar, project, tp4Var, 11), 3);
                break;
            case 12:
                yt0 yt0Var = (yt0) obj;
                yt0Var.getClass();
                xp0 xp0Var = (xp0) this.receiver;
                xp0Var.getClass();
                xp0Var.p.setValue(yt0Var);
                xp0Var.r.setValue(Boolean.TRUE);
                break;
            case 13:
                double dDoubleValue2 = ((Number) obj).doubleValue();
                ((sn6) this.receiver).getClass();
                break;
            case 14:
                String strM579unboximpl = ((VoiceSelection) obj).m579unboximpl();
                strM579unboximpl.getClass();
                ((k5j) this.receiver).L(strM579unboximpl);
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((mj1) this.receiver).W(((Boolean) obj).booleanValue());
                break;
            case 16:
                ((mj1) this.receiver).W(((Boolean) obj).booleanValue());
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                double dDoubleValue3 = ((Number) obj).doubleValue();
                ((rdd) this.receiver).getClass();
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                double dDoubleValue4 = ((Number) obj).doubleValue();
                ((rdd) this.receiver).getClass();
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                double dDoubleValue5 = ((Number) obj).doubleValue();
                ((rdd) this.receiver).getClass();
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                double dDoubleValue6 = ((Number) obj).doubleValue();
                ((rdd) this.receiver).getClass();
                break;
            case 21:
                double dDoubleValue7 = ((Number) obj).doubleValue();
                ((rdd) this.receiver).getClass();
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                double dDoubleValue8 = ((Number) obj).doubleValue();
                ((rdd) this.receiver).getClass();
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                qb2 qb2Var = (qb2) this.receiver;
                gb9.D(qb2Var.a, null, null, new ob2(qb2Var, zBooleanValue, tp4Var, 5), 3);
                break;
            case 24:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                qb2 qb2Var2 = (qb2) this.receiver;
                gb9.D(qb2Var2.a, null, null, new ob2(qb2Var2, zBooleanValue2, tp4Var, 4), 3);
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                qb2 qb2Var3 = (qb2) this.receiver;
                gb9.D(qb2Var3.a, null, null, new ob2(qb2Var3, zBooleanValue3, tp4Var, i2), 3);
                break;
            case 26:
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                qb2 qb2Var4 = (qb2) this.receiver;
                McpServer mcpServerR = qb2Var4.R();
                if (mcpServerR != null) {
                    gb9.D(qb2Var4.a, null, null, new ku(qb2Var4, mcpServerR, zBooleanValue4, (tp4) null, 3), 3);
                }
                break;
            case 27:
                boolean zBooleanValue5 = ((Boolean) obj).booleanValue();
                qb2 qb2Var5 = (qb2) this.receiver;
                gb9.D(qb2Var5.a, null, null, new ob2(qb2Var5, zBooleanValue5, tp4Var, 6), 3);
                break;
            case 28:
                boolean zBooleanValue6 = ((Boolean) obj).booleanValue();
                qb2 qb2Var6 = (qb2) this.receiver;
                if (zBooleanValue6 != qb2Var6.d.k()) {
                    gb9.D(qb2Var6.a, null, null, new ob2(qb2Var6, zBooleanValue6, tp4Var, 9), 3);
                }
                break;
            default:
                boolean zBooleanValue7 = ((Boolean) obj).booleanValue();
                qb2 qb2Var7 = (qb2) this.receiver;
                if (zBooleanValue7 != qb2Var7.U()) {
                    gb9.D(qb2Var7.a, null, null, new ob2(qb2Var7, zBooleanValue7, tp4Var, 7), 3);
                }
                break;
        }
        return ieiVar;
    }
}
