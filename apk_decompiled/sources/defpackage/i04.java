package defpackage;

import android.content.Context;
import android.widget.TextView;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.chat.parse.ParsedContentBlockId;
import com.anthropic.claude.code.remote.NewCodeSessionPrefill;
import com.anthropic.claude.code.ui.DiffLineComment;
import com.anthropic.claude.sessions.types.SessionResource;
import com.anthropic.claude.tool.model.KnowledgeSource;
import java.util.Iterator;
import java.util.Locale;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i04 implements bz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ i04(int i) {
        this.E = i;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        int length = 0;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                SessionResource sessionResource = (SessionResource) obj;
                sessionResource.getClass();
                break;
            case 1:
                ((SessionResource) obj).getClass();
                break;
            case 2:
                srf srfVar = (srf) obj;
                srfVar.getClass();
                break;
            case 3:
                ((NewCodeSessionPrefill) obj).getClass();
                break;
            case 4:
                ((i90) obj).getClass();
                break;
            case 5:
                DiffLineComment diffLineComment = (DiffLineComment) obj;
                diffLineComment.getClass();
                Integer newLineNumber = diffLineComment.getNewLineNumber();
                if (newLineNumber == null) {
                    newLineNumber = diffLineComment.getOldLineNumber();
                }
                StringBuilder sb = new StringBuilder();
                sb.append("In `" + diffLineComment.getFilePath() + "` at line " + newLineNumber + ":\n\n");
                String lineContent = diffLineComment.getLineContent();
                StringBuilder sb2 = new StringBuilder("> ");
                sb2.append(lineContent);
                sb2.append("\n\n");
                sb.append(sb2.toString());
                sb.append(diffLineComment.getCommentText());
                break;
            case 6:
                og9 og9Var = (og9) obj;
                og9Var.getClass();
                og9Var.c = true;
                break;
            case 7:
                mqg mqgVar = (mqg) obj;
                mqgVar.getClass();
                Iterator it = mqgVar.b.iterator();
                while (it.hasNext()) {
                    length += ((String) it.next()).length();
                }
                break;
            case 8:
                mqg mqgVar2 = (mqg) obj;
                mqgVar2.getClass();
                break;
            case 9:
                String str = (String) obj;
                str.getClass();
                if (str.length() > 0) {
                    StringBuilder sb3 = new StringBuilder();
                    String strValueOf = String.valueOf(str.charAt(0));
                    strValueOf.getClass();
                    String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    sb3.append((Object) upperCase);
                    sb3.append(str.substring(1));
                }
                break;
            case 10:
                String str2 = (String) obj;
                str2.getClass();
                if (str2.length() > 0) {
                    StringBuilder sb4 = new StringBuilder();
                    String strValueOf2 = String.valueOf(str2.charAt(0));
                    strValueOf2.getClass();
                    String upperCase2 = strValueOf2.toUpperCase(Locale.ROOT);
                    upperCase2.getClass();
                    sb4.append((Object) upperCase2);
                    sb4.append(str2.substring(1));
                }
                break;
            case 11:
                ((Integer) obj).getClass();
                yig yigVar = g34.a;
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                break;
            case 16:
                String str3 = (String) obj;
                str3.getClass();
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                Context context = (Context) obj;
                context.getClass();
                TextView textView = new TextView(context);
                textView.setSingleLine(true);
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ((ParsedContentBlockId) obj).getClass();
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((ParsedContentBlockId) obj).getClass();
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ((KnowledgeSource) obj).getClass();
                break;
            case 21:
                ((KnowledgeSource) obj).getClass();
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((Integer) obj).getClass();
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((KnowledgeSource) obj).getClass();
                break;
            case 24:
                ((uub) obj).getClass();
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                ((ekf) obj).getClass();
                break;
            case 26:
                ekf ekfVar = (ekf) obj;
                ekfVar.getClass();
                ckf.e(ekfVar);
                break;
            case 27:
                ekf ekfVar2 = (ekf) obj;
                ekfVar2.getClass();
                ckf.e(ekfVar2);
                break;
            case 28:
                ((cjh) obj).getClass();
                break;
            default:
                ((cjh) obj).getClass();
                break;
        }
        return ieiVar;
    }
}
