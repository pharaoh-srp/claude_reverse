package defpackage;

import android.app.DownloadManager;
import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.MessageFileEvents$DownloadOutcome;
import com.anthropic.claude.analytics.events.MessageFileEvents$FileDownloadResult;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class sa6 {
    public final Context a;
    public final qi3 b;
    public final mp4 d;
    public final cy1 g;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final zy1 e = x44.a();
    public final zy1 f = wd6.P(-1, 6, null);

    public sa6(Context context, qi3 qi3Var, h86 h86Var) {
        this.a = context;
        this.b = qi3Var;
        this.d = fd9.c(nai.Z(iuj.g(), h86Var.b()));
        cy1 cy1Var = new cy1(2, this);
        this.g = cy1Var;
        x44.f0(context, cy1Var, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
    }

    public static final void a(sa6 sa6Var, long j) throws IOException {
        dwc dwcVar = (dwc) sa6Var.c.remove(Long.valueOf(j));
        if (dwcVar == null) {
            return;
        }
        qi3 qi3Var = sa6Var.b;
        Object systemService = sa6Var.a.getSystemService("download");
        systemService.getClass();
        DownloadManager downloadManager = (DownloadManager) systemService;
        try {
            Cursor cursorQuery = downloadManager.query(new DownloadManager.Query().setFilterById(j));
            if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                qi3Var.e(new MessageFileEvents$FileDownloadResult(dwcVar.d(), dwcVar.b(), MessageFileEvents$DownloadOutcome.CANCELLED, (String) null, 8, (mq5) null), iv1.J(jce.b(MessageFileEvents$FileDownloadResult.class)));
                return;
            }
            try {
                int i = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("status"));
                if (i == 8) {
                    qi3Var.e(new MessageFileEvents$FileDownloadResult(dwcVar.d(), dwcVar.b(), MessageFileEvents$DownloadOutcome.SUCCESS, (String) null, 8, (mq5) null), iv1.J(jce.b(MessageFileEvents$FileDownloadResult.class)));
                    if (dwcVar.c()) {
                        Uri uriForDownloadedFile = downloadManager.getUriForDownloadedFile(j);
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("media_type"));
                        if (string == null) {
                            string = "application/octet-stream";
                        }
                        if (uriForDownloadedFile != null) {
                            sa6Var.f.r(new qa6(uriForDownloadedFile, string, dwcVar.a()));
                        }
                    }
                } else if (i == 16) {
                    qi3Var.e(new MessageFileEvents$FileDownloadResult(dwcVar.d(), dwcVar.b(), MessageFileEvents$DownloadOutcome.DOWNLOAD_FAILED, String.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("reason")))), iv1.J(jce.b(MessageFileEvents$FileDownloadResult.class)));
                    sa6Var.e.r(new pt6(R.string.wiggle_download_failed));
                }
                cursorQuery.close();
            } finally {
            }
        } catch (Exception e) {
            List list = xah.a;
            xah.f(e, "DownloadManager.query() rejected by OEM DownloadProvider", ozf.F, null, 24);
        }
    }
}
