package defpackage;

import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.types.strings.ChatId;
import java.io.File;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class g96 extends x1 {
    public final /* synthetic */ int G = 0;
    public final Object H;
    public final Object I;

    public g96(uj7 uj7Var) {
        this.I = uj7Var;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.H = arrayDeque;
        File file = (File) uj7Var.b;
        if (file.isDirectory()) {
            arrayDeque.push(c(file));
        } else if (!file.isFile()) {
            this.E = 2;
        } else {
            file.getClass();
            arrayDeque.push(new rj7(file));
        }
    }

    @Override // defpackage.x1
    public final void a() {
        File file;
        File fileA;
        int i = this.G;
        Object obj = this.H;
        switch (i) {
            case 0:
                Iterator it = (Iterator) obj;
                while (it.hasNext()) {
                    Object next = it.next();
                    ChatConversationWithProjectReference chatConversationWithProjectReference = (ChatConversationWithProjectReference) next;
                    chatConversationWithProjectReference.getClass();
                    if (((HashSet) this.I).add(ChatId.m978boximpl(chatConversationWithProjectReference.m209getUuidRjYBDck()))) {
                        this.F = next;
                        this.E = 1;
                        break;
                    }
                }
                this.E = 2;
                break;
            default:
                ArrayDeque arrayDeque = (ArrayDeque) obj;
                while (true) {
                    tj7 tj7Var = (tj7) arrayDeque.peek();
                    if (tj7Var == null) {
                        file = null;
                    } else {
                        fileA = tj7Var.a();
                        if (fileA == null) {
                            arrayDeque.pop();
                        } else if (!fileA.equals(tj7Var.a) && fileA.isDirectory() && arrayDeque.size() < Integer.MAX_VALUE) {
                            arrayDeque.push(c(fileA));
                        }
                    }
                }
                file = fileA;
                if (file == null) {
                    this.E = 2;
                } else {
                    this.F = file;
                    this.E = 1;
                }
                break;
        }
    }

    public pj7 c(File file) {
        int iOrdinal = ((jk7) ((uj7) this.I).c).ordinal();
        if (iOrdinal == 0) {
            return new sj7(this, file);
        }
        if (iOrdinal == 1) {
            file.getClass();
            return new qj7(file);
        }
        mr9.b();
        return null;
    }

    public g96(Iterator it) {
        it.getClass();
        this.H = it;
        this.I = new HashSet();
    }
}
