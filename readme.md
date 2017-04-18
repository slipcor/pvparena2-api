![PVP-Arena](/doc/images/logo.png)

#PVP Arena v2.0 - API

The API for the upcoming new rewritten version of PVP Arena v2.0

***

## Discussion

- IRC: [irc.esper.net#pvparena](http://chat.mibbit.com/?server=irc.esper.net&channel=%23pvparena)
- Discord: [click me](https://discord.gg/Typvra2)

***

## Dependencies

- Java 8
- Spigot 1.9.4

***

## Downloads

- will be built at request, but probably not for now, there is no implementation now anyways

***

## Documentation

- see the JavaDocs - feel free to leave comments where they are wrong or lack information

## What are we doing here?

Discussing the API:
- what is missing?
- what should be returning different things?
- what should take different arguments?

## IQueryResult

A new concept of ordering access and flow in the plugin might be the queries. 
For example the plugin might call a 'queryPlayerJoin' to query the arena's goals, modules etc, 
each one will be able to object to this joining going through, and each loadable will have the 
possibility to claim ownership of the handling of this event, by attaching itself to the resulting list.
 
Finally there will be a playerJoinPostHandle, offered to all loadables after no objections were issued.
 
For PVP Arena v1.3 modders:

- checkJoin becomes playerJoinCheck
- commitJoin becomes playerJoinHandle
- parseJoin becomes playerJoinPostHandle
- specific Cancellable event handling will be grouped into a playerCancellable(Check/Handle/PostHandle)
- several existing methods will be replaced by fitting new-system methods, please see the goal and module implementations!
- some methods are removed and will be replaced by per-module or per-goal solutions

## Credits

- Deminetix for the very root, the Fight plugin
- Bradley Hilton for the fork until version v0.0.3
- Carbon131 for adding features until version v0.0.5
- Drehverschluss for great support during the v0.6+v0.7 rewrite
- NodinChan for helping me cleaning up my code and for his loader!
- zyxep and Bradley Hilton for the Jenkins
- Oruss7 for the documentation head start

***
