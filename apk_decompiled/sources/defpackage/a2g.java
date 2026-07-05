package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.ChatMessageActionEvents$ActionSource;
import com.anthropic.claude.api.chat.messages.MessageFlag;
import com.anthropic.claude.chat.share.k;
import com.anthropic.claude.types.strings.MessageId;
import java.util.List;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class a2g implements pz7 {
    public static final a2g F = new a2g(0);
    public static final a2g G = new a2g(1);
    public static final a2g H = new a2g(2);
    public static final a2g I = new a2g(3);
    public static final a2g J = new a2g(4);
    public static final a2g K = new a2g(5);
    public static final a2g L = new a2g(6);
    public static final a2g M = new a2g(7);
    public final /* synthetic */ int E;

    public /* synthetic */ a2g(int i) {
        this.E = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((MessageId) obj).m1057unboximpl().getClass();
                ((MessageFlag) obj2).getClass();
                break;
            case 1:
                String strM1057unboximpl = ((MessageId) obj2).m1057unboximpl();
                ((ChatMessageActionEvents$ActionSource) obj).getClass();
                strM1057unboximpl.getClass();
                k.c("onSelect");
                break;
            case 2:
                String strM1057unboximpl2 = ((MessageId) obj2).m1057unboximpl();
                ((String) obj).getClass();
                strM1057unboximpl2.getClass();
                k.c("onCopyMessage");
                break;
            case 3:
                String strM1057unboximpl3 = ((MessageId) obj2).m1057unboximpl();
                ((String) obj).getClass();
                strM1057unboximpl3.getClass();
                wjk.p("onCopyMessage");
                break;
            case 4:
                p68 p68Var = (p68) obj2;
                if (p68Var instanceof pb) {
                }
                break;
            case 5:
                break;
            case 6:
                p68 p68Var2 = (p68) obj2;
                if (p68Var2 instanceof gaj) {
                }
                break;
            case 7:
                p68 p68Var3 = (p68) obj2;
                if (p68Var3 instanceof km8) {
                }
                break;
            case 8:
                ((List) obj).getClass();
                ((List) obj2).getClass();
                break;
            case 9:
                ((List) obj).getClass();
                ((List) obj2).getClass();
                break;
            case 10:
                ((List) obj).getClass();
                ((List) obj2).getClass();
                break;
            case 11:
                ((List) obj).getClass();
                ((List) obj2).getClass();
                break;
            case 12:
                ((List) obj).getClass();
                ((List) obj2).getClass();
                break;
            case 13:
                ((List) obj).getClass();
                ((List) obj2).getClass();
                break;
            case 14:
                ((List) obj).getClass();
                ((List) obj2).getClass();
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((List) obj).getClass();
                ((List) obj2).getClass();
                break;
            case 16:
                ((List) obj).getClass();
                ((List) obj2).getClass();
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((List) obj).getClass();
                ((List) obj2).getClass();
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                qy1.s((List) obj, (List) obj2);
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                qy1.s((List) obj, (List) obj2);
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                qy1.s((List) obj, (List) obj2);
                break;
            case 21:
                ((List) obj).getClass();
                ((List) obj2).getClass();
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((List) obj).getClass();
                ((List) obj2).getClass();
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((List) obj).getClass();
                ((List) obj2).getClass();
                break;
            case 24:
                qy1.s((List) obj, (List) obj2);
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                qy1.s((List) obj, (List) obj2);
                break;
            case 26:
                qy1.s((List) obj, (List) obj2);
                break;
            case 27:
                qy1.s((List) obj, (List) obj2);
                break;
            case 28:
                qy1.s((List) obj, (List) obj2);
                break;
            default:
                qy1.s((List) obj, (List) obj2);
                break;
        }
        return ieiVar;
    }
}
