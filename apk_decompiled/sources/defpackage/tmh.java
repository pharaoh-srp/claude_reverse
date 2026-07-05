package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.anthropic.claude.api.chat.tool.Tool;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class tmh implements ServiceConnection {
    public final /* synthetic */ vmh E;
    public final /* synthetic */ xmh F;
    public final /* synthetic */ String G;
    public final /* synthetic */ umh H;

    public tmh(vmh vmhVar, xmh xmhVar, String str, umh umhVar) {
        this.E = vmhVar;
        this.F = xmhVar;
        this.G = str;
        this.H = umhVar;
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        this.E.invoke("null_binding", this.F.f + " refused the service binding.");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        uu8 uu8Var;
        xmh xmhVar = this.F;
        Tool.CustomTool customTool = xmhVar.g;
        if (iBinder != null) {
            int i = tu8.i;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.anthropic.claude.tool.thirdparty.IToolExecutionService");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof uu8)) {
                su8 su8Var = new su8();
                su8Var.i = iBinder;
                uu8Var = su8Var;
            } else {
                uu8Var = (uu8) iInterfaceQueryLocalInterface;
            }
        } else {
            uu8Var = null;
        }
        vmh vmhVar = this.E;
        if (uu8Var == null) {
            vmhVar.invoke("null_binding", xmhVar.f + " returned a null binder.");
            return;
        }
        try {
            String name = customTool.getName();
            String str = this.G;
            umh umhVar = this.H;
            su8 su8Var2 = (su8) uu8Var;
            Parcel parcelObtain = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.anthropic.claude.tool.thirdparty.IToolExecutionService");
                parcelObtain.writeString(name);
                parcelObtain.writeString(str);
                parcelObtain.writeStrongInterface(umhVar);
                su8Var2.i.transact(1, parcelObtain, null, 1);
            } finally {
                parcelObtain.recycle();
            }
        } catch (Throwable th) {
            zfa.a.getClass();
            if (yfa.b()) {
                CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj : copyOnWriteArrayList) {
                    ((n30) ((zfa) obj)).getClass();
                    arrayList.add(obj);
                }
                if (!arrayList.isEmpty()) {
                    zfa.a.getClass();
                    String strK = ij0.k("Remote tool execution failed for ", customTool.getName(), ": ", gsk.c(th));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((n30) ((zfa) it.next())).b(sfa.WARN, "ThirdPartyAppTool", strK);
                    }
                }
            }
            vmhVar.invoke("remote_exception", "Remote tool execution failed: " + th.getMessage());
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zfa.a.getClass();
        if (yfa.b()) {
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList.add(obj);
            }
            if (!arrayList.isEmpty()) {
                zfa.a.getClass();
                String str = "Tool execution service disconnected: " + componentName;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfa.DEBUG, "ThirdPartyAppTool", str);
                }
            }
        }
        this.E.invoke("disconnected", this.F.f + " service disconnected unexpectedly.");
    }
}
