package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class mda extends xzg implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ Uri F;
    public final /* synthetic */ oda G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mda(oda odaVar, Uri uri, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = odaVar;
        this.F = uri;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        oda odaVar = this.G;
        Uri uri = this.F;
        switch (i) {
            case 0:
                return new mda(odaVar, uri, tp4Var);
            default:
                return new mda(uri, odaVar, tp4Var);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((mda) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws FileNotFoundException {
        int i = this.E;
        oda odaVar = this.G;
        Uri uri = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                ContentResolver contentResolver = odaVar.c;
                contentResolver.getClass();
                return jlk.i(contentResolver, uri);
            default:
                sf5.h0(obj);
                if (x44.r(uri.getScheme(), "file")) {
                    return new FileInputStream(uri.getPath());
                }
                InputStream inputStreamOpenInputStream = odaVar.c.openInputStream(uri);
                if (inputStreamOpenInputStream != null) {
                    return inputStreamOpenInputStream;
                }
                sz6.j("Local File URI returned null input stream");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mda(Uri uri, oda odaVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = uri;
        this.G = odaVar;
    }
}
