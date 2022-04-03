 package com.company;

public class Numbers {
    protected String symbol = "+";
    protected final String[][] ZERO = {
            {" ", symbol, symbol, symbol, " "},                            // {"-@@@-"},
            {symbol, " ", " ", " ", symbol},                               // {"@---@"},
            {symbol, " ", " ", " ", symbol},                               // {"@---@"},
            {symbol, " ", " ", " ", symbol},                               // {"@---@"},
            {symbol, " ", " ", " ", symbol},                               // {"@---@"},
            {" ", symbol, symbol, symbol, " "}                             // {"-@@@-"}
    };

    protected final String[][] ONE = {
            {" ", " ", " ", symbol, symbol},                               // {"---@@"},
            {" ", " ", symbol, " ", symbol},                               // {"--@-@"},
            {" ", symbol, " ", " ", symbol},                               // {"@---@"},
            {" ", " ", " ", " ", symbol},                                  // {"----@"},
            {" ", " ", " ", " ", symbol},                                  // {"----@"},
            {" ", " ", " ", " ", symbol}                                   // {"----@"}
    };

    protected final String[][] TWO = {
            {" ", symbol, symbol, symbol, " "},                            // {"-@@@-"},
            {symbol, " ", " ", " ", symbol},                               // {"@---@"},
            {" ", " ", " ", " ", symbol},                                  // {"----@"},
            {" ", " ", symbol, symbol, " "},                               // {"--@@-"},
            {" ", symbol, " ", " ", " "},                                  // {"-@---"},
            {symbol, symbol, symbol, symbol, symbol}                       // {"@@@@@"}
    };

    protected final String[][] THREE = {
            {symbol, symbol, symbol, symbol, symbol},                      // {"@@@@@"},
            {" ", " ", " ", " ", symbol},                                  // {"----@"},
            {" ", " ", symbol, symbol, " "},                               // {"--@@-"},
            {" ", " ", " ", " ", symbol},                                  // {"----@"},
            {symbol, " ", " ", " ", symbol},                               // {"@---@"},
            {" ", symbol, symbol, symbol, " "}                             // {"-@@@-"}
    };

    protected final String[][] FOUR = {
            {" ", " ", symbol, " ", symbol},                               // {"--@-@"},
            {" ", symbol, " ", " ", symbol},                               // {"-@--@"},
            {symbol, " ", " ", " ", symbol},                               // {"@---@"},
            {symbol, symbol, symbol, symbol, symbol},                      // {"@@@@@"},
            {" ", " ", " ", " ", symbol},                                  // {"----@"},
            {" ", " ", " ", " ", symbol}                                   // {"----@"}
    };

    protected final String[][] FIVE = {
            {symbol, symbol, symbol, symbol, symbol},                      // {"@@@@@"},
            {symbol, " ", " ", " ", " "},                                  // {"@----"},
            {symbol, symbol, symbol, symbol, " "},                         // {"@@@@-"},
            {" ", " ", " ", " ", symbol},                                  // {"----@"},
            {" ", " ", " ", " ", symbol},                                  // {"----@"},
            {symbol, symbol, symbol, symbol, " "}                          // {"@@@@-"}
    };

    protected final String[][] SIX = {
            {" ", symbol, symbol, symbol, " "},                            // {"-@@@-"},
            {symbol, " ", " ", " ", symbol},                               // {"@---@"},
            {symbol, " ", " ", " ", " "},                                  // {"@----"},
            {symbol, symbol, symbol, symbol, " "},                         // {"@@@@-"},
            {symbol, " ", " ", " ", symbol},                               // {"@---@"},
            {" ", symbol, symbol, symbol, " "}                             // {"-@@@-"}
    };

    protected final String[][] SEVEN = {
            {symbol, symbol, symbol, symbol, symbol},                      // {"@@@@@"}
            {" ", " ", " ", " ", symbol},                                  // {"----@"},
            {" ", " ", " ", symbol, " "},                                  // {"---@-"},
            {" ", " ", symbol, " ", " "},                                  // {"--@--"},
            {" ", " ", symbol, " ", " "},                                  // {"--@--"},
            {" ", " ", symbol, " ", " "}                                   // {"--@--"}
    };

    protected final String[][] EIGHT = {
            {" ", symbol, symbol, symbol, " "},                            // {"-@@@-"},
            {symbol, " ", " ", " ", symbol},                               // {"@---@"},
            {" ", symbol, symbol, symbol, " "},                            // {"-@@@-"},
            {symbol, " ", " ", " ", symbol},                               // {"@---@"},
            {symbol, " ", " ", " ", symbol},                               // {"@---@"},
            {" ", symbol, symbol, symbol, " "}                             // {"-@@@-"}
    };

    protected final String[][] NINE = {
            {" ", symbol, symbol, symbol, " "},                            // {"-@@@-"},
            {symbol, " ", " ", " ", symbol},                               // {"@---@"},
            {" ", symbol, symbol, symbol, symbol},                         // {"-@@@@"},
            {" ", " ", " ", " ", symbol},                                  // {"----@"},
            {symbol, " ", " ", " ", symbol},                               // {"@---@"},
            {" ", symbol, symbol, symbol, " "}                             // {"-@@@-"}
    };
}
