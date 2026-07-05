package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public enum jde {
    IGNORE_CASE(2),
    /* JADX INFO: Fake field, exist only in values array */
    MULTILINE(8),
    /* JADX INFO: Fake field, exist only in values array */
    LITERAL(16),
    /* JADX INFO: Fake field, exist only in values array */
    UNIX_LINES(1),
    /* JADX INFO: Fake field, exist only in values array */
    COMMENTS(4),
    DOT_MATCHES_ALL(32),
    /* JADX INFO: Fake field, exist only in values array */
    CANON_EQ(FreeTypeConstants.FT_LOAD_PEDANTIC);

    public final int E;

    jde(int i) {
        this.E = i;
    }
}
