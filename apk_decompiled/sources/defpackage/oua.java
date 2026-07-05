package defpackage;

import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.ResponseUtils;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.mcp.McpTool;
import com.anthropic.claude.api.memory.MelangeMeta;
import com.anthropic.router.panes.Panes;
import com.google.android.gms.maps.model.LatLng;
import java.util.WeakHashMap;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oua implements pz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ oua(int i) {
        this.E = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                pua puaVar = (pua) obj2;
                ((y4f) obj).getClass();
                puaVar.getClass();
                return (LatLng) puaVar.a.getValue();
            case 1:
                ((Integer) obj).intValue();
                McpTool mcpTool = (McpTool) obj2;
                mcpTool.getClass();
                String strM352getEnabled_keyA4OzCrU = mcpTool.m352getEnabled_keyA4OzCrU();
                return strM352getEnabled_keyA4OzCrU == null ? mcpTool.getName() : strM352getEnabled_keyA4OzCrU;
            case 2:
                ((Integer) obj).intValue();
                MelangeMeta melangeMeta = (MelangeMeta) obj2;
                melangeMeta.getClass();
                return melangeMeta.getPath();
            case 3:
                ((Integer) obj2).getClass();
                e18 e18Var = (e18) ((ld4) obj);
                e18Var.a0(-511854661);
                uu1 uu1Var = uu1.a;
                WeakHashMap weakHashMap = gdj.x;
                a5a a5aVar = new a5a(s4i.d(e18Var).l, 48);
                e18Var.p(false);
                return a5aVar;
            case 4:
                m7f m7fVar = (m7f) obj;
                m7fVar.getClass();
                ((bsc) obj2).getClass();
                f1c f1cVar = new f1c(yb5.g(m7fVar));
                f1cVar.a.setValue(Boolean.TRUE);
                return f1cVar;
            case 5:
                int iIntValue = ((Integer) obj).intValue();
                if (((p68) obj2) instanceof pb) {
                    iIntValue++;
                }
                return Integer.valueOf(iIntValue);
            case 6:
                vd7 vd7Var = (vd7) obj;
                p68 p68Var = (p68) obj2;
                if ((p68Var instanceof gaj) || (p68Var instanceof km8) || (p68Var instanceof q35)) {
                    return new vd7(vd7Var.a.d(p68Var), vd7Var.b);
                }
                return new vd7(vd7Var.a, vd7Var.b.d(p68Var));
            case 7:
                return Integer.valueOf(((h5b) obj).Q(((Integer) obj2).intValue()));
            case 8:
                return Integer.valueOf(((h5b) obj).o(((Integer) obj2).intValue()));
            case 9:
                return Integer.valueOf(((h5b) obj).a(((Integer) obj2).intValue()));
            case 10:
                return Integer.valueOf(((h5b) obj).l(((Integer) obj2).intValue()));
            case 11:
                ((Panes) obj).getClass();
                ((Panes) obj2).getClass();
                return ieiVar;
            case 12:
                ((Panes) obj).getClass();
                ((Panes) obj2).getClass();
                return ieiVar;
            case 13:
                ((Panes) obj).getClass();
                ((Panes) obj2).getClass();
                return ieiVar;
            case 14:
                ((Panes) obj).getClass();
                ((Panes) obj2).getClass();
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((Panes) obj).getClass();
                ((Panes) obj2).getClass();
                return ieiVar;
            case 16:
                ((Panes) obj).getClass();
                ((Panes) obj2).getClass();
                return ieiVar;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((Panes) obj).getClass();
                ((Panes) obj2).getClass();
                return ieiVar;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ((Panes) obj).getClass();
                ((Panes) obj2).getClass();
                return ieiVar;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((Panes) obj).getClass();
                ((Panes) obj2).getClass();
                return ieiVar;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ((Integer) obj2).getClass();
                jpi.a(x44.p0(1), (ld4) obj);
                return ieiVar;
            case 21:
                ((r7a) obj).getClass();
                ((r7a) obj2).getClass();
                return Boolean.TRUE;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((r7a) obj).getClass();
                ((r7a) obj2).getClass();
                return Boolean.TRUE;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((r7a) obj).getClass();
                ((r7a) obj2).getClass();
                return Boolean.TRUE;
            case 24:
                ((r7a) obj).getClass();
                ((r7a) obj2).getClass();
                return Boolean.TRUE;
            case BuildConfig.VERSION_CODE /* 25 */:
                ((Integer) obj).intValue();
                u0d u0dVar = (u0d) obj2;
                u0dVar.getClass();
                return Integer.valueOf(u0dVar.a);
            case 26:
                ((Integer) obj2).getClass();
                qik.l(x44.p0(1), (ld4) obj);
                return ieiVar;
            case 27:
                ((Integer) obj).getClass();
                qhe qheVar = (qhe) obj2;
                qheVar.getClass();
                return qheVar.a;
            case 28:
                return ResponseUtils.Companion.handleGetCredentialResponse$lambda$0((CancellationSignal) obj, (zy7) obj2);
            default:
                ((Integer) obj2).getClass();
                e18 e18Var2 = (e18) ((ld4) obj);
                e18Var2.a0(1840009000);
                tkh tkhVar = (tkh) e18Var2.j(tjh.a);
                e18Var2.p(false);
                return tkhVar;
        }
    }

    public /* synthetic */ oua(int i, int i2) {
        this.E = i2;
    }
}
