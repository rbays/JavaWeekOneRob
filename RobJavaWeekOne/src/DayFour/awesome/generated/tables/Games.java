/**
 * This class is generated by jOOQ
 */
package DayFour.awesome.generated.tables;


import DayFour.awesome.generated.Awesome;
import DayFour.awesome.generated.Keys;
import DayFour.awesome.generated.tables.records.GamesRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Games extends TableImpl<GamesRecord> {

    private static final long serialVersionUID = 1188329442;

    /**
     * The reference instance of <code>awesome.games</code>
     */
    public static final Games GAMES = new Games();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GamesRecord> getRecordType() {
        return GamesRecord.class;
    }

    /**
     * The column <code>awesome.games.Id</code>.
     */
    public final TableField<GamesRecord, Integer> ID = createField("Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>awesome.games.title</code>.
     */
    public final TableField<GamesRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR.length(40), this, "");

    /**
     * The column <code>awesome.games.genre</code>.
     */
    public final TableField<GamesRecord, String> GENRE = createField("genre", org.jooq.impl.SQLDataType.VARCHAR.length(40), this, "");

    /**
     * The column <code>awesome.games.dev</code>.
     */
    public final TableField<GamesRecord, String> DEV = createField("dev", org.jooq.impl.SQLDataType.VARCHAR.length(40), this, "");

    /**
     * The column <code>awesome.games.price</code>.
     */
    public final TableField<GamesRecord, Double> PRICE = createField("price", org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * Create a <code>awesome.games</code> table reference
     */
    public Games() {
        this("games", null);
    }

    /**
     * Create an aliased <code>awesome.games</code> table reference
     */
    public Games(String alias) {
        this(alias, GAMES);
    }

    private Games(String alias, Table<GamesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Games(String alias, Table<GamesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Awesome.AWESOME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<GamesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_GAMES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<GamesRecord> getPrimaryKey() {
        return Keys.KEY_GAMES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GamesRecord>> getKeys() {
        return Arrays.<UniqueKey<GamesRecord>>asList(Keys.KEY_GAMES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Games as(String alias) {
        return new Games(alias, this);
    }

    /**
     * Rename this table
     */
    public Games rename(String name) {
        return new Games(name, null);
    }
}