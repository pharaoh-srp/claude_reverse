package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes3.dex */
public final class foj implements Runnable {
    public static final s20 G = new s20("RevokeAccessOperation", new String[0]);
    public final String E;
    public final zmg F;

    public foj(String str) {
        dgj.s(str);
        this.E = str;
        this.F = new zmg(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        s20 s20Var = G;
        Status status = Status.K;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.E).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.I;
            } else {
                Log.e((String) s20Var.F, ((String) s20Var.G).concat("Unable to revoke access!"));
            }
            String str = "Response Code: " + responseCode;
            if (s20Var.E <= 3) {
                ((String) s20Var.G).concat(str);
            }
        } catch (IOException e) {
            Log.e((String) s20Var.F, ((String) s20Var.G).concat("IOException when revoking access: ".concat(String.valueOf(e.toString()))));
        } catch (Exception e2) {
            Log.e((String) s20Var.F, ((String) s20Var.G).concat("Exception when revoking access: ".concat(String.valueOf(e2.toString()))));
        }
        this.F.e(status);
    }
}
